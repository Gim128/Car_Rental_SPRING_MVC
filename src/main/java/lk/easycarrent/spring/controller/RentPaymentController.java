package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.DriverDTO;
import lk.easycarrent.spring.dto.RentPaymentDTO;
import lk.easycarrent.spring.exception.NotFoundException;
import lk.easycarrent.spring.service.DriverService;
import lk.easycarrent.spring.service.RentPaymentService;
import lk.easycarrent.spring.util.StandardResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/easycarrent/rentpayment")

public class RentPaymentController {
    @Autowired
    private RentPaymentService rentPaymentService ;

    @GetMapping(path = "search")
    public ResponseEntity searchRentPayment(String id){
        RentPaymentDTO rentPaymentDTO = rentPaymentService.searchRentPayment(id);
        return new ResponseEntity(new StandardResponce("200", "Done", rentPaymentDTO), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveRentPayment(@RequestBody RentPaymentDTO rentPaymentDTO){
        if (rentPaymentDTO.getRentID().trim().length() <= 0) {
            throw new NotFoundException("Damage id cannot be empty");
        }
        rentPaymentService.addRentPayment(rentPaymentDTO);
        return new ResponseEntity(new StandardResponce("201", "Done", rentPaymentDTO), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody RentPaymentDTO rentPaymentDTO){

        if (rentPaymentDTO.getRentID().trim().length() <= 0) {
            throw new NotFoundException("No id provided to update");
        }
        rentPaymentService.updateRentPayment(rentPaymentDTO);
        return new ResponseEntity(new StandardResponce("200", "Done", rentPaymentDTO), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity DeleteRentpayment(String id){

        rentPaymentService.deleteRentPayment(id);
        return new ResponseEntity(new StandardResponce("200", "Done", null), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllRentPayment(@RequestBody DriverDTO driverDTO){
        ArrayList<RentPaymentDTO> allRentPayment = rentPaymentService.getAllRentPayment();
        return new ResponseEntity(new StandardResponce("200", "Done", allRentPayment), HttpStatus.OK);
    }
}
