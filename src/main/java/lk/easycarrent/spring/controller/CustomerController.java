package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.Exception.NotFoundException;
import lk.easycarrent.spring.dto.CustomerDTO;
import lk.easycarrent.spring.service.CustomerService;
import lk.easycarrent.spring.util.StandardResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/easycarrent/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping(path = "search")
    public ResponseEntity searchCustomer(String id){
        CustomerDTO dto = service.searchCustomer(id);
        return new ResponseEntity(new StandardResponce("200", "Done", dto), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO dto){
        if (dto.getCustomerID().trim().length() <= 0) {
            throw new NotFoundException("Customer id cannot be empty");
        }
        service.addCustomer(dto);
        return new ResponseEntity(new StandardResponce("201", "Done", dto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto){
        if (dto.getCustomerID().trim().length() <= 0) {
            throw new NotFoundException("No id provided to update");
        }
        service.updateCustomer(dto);
        return new ResponseEntity(new StandardResponce("200", "Done", dto), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity DeleteCustomer(String id){

        service.deleteCustomer(id);
        return new ResponseEntity(new StandardResponce("200", "Done", null), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCustomer(@RequestBody CustomerDTO dto){
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        return new ResponseEntity(new StandardResponce("200", "Done", allCustomers), HttpStatus.OK);
    }
}
