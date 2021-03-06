package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.CustomerDTO;
import lk.easycarrent.spring.dto.DamageDTO;
import lk.easycarrent.spring.exception.NotFoundException;
import lk.easycarrent.spring.service.CustomerService;
import lk.easycarrent.spring.service.DamageService;
import lk.easycarrent.spring.util.StandardResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/easycarrent/damage")
public class DamageController {
    @Autowired
    private DamageService damageService ;

    @GetMapping(path = "search/{id}")
    public ResponseEntity searchDamage(String id){
        DamageDTO damageDTO = damageService.searchDamage(id);
        return new ResponseEntity(new StandardResponce("200", "Done", damageDTO), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveDamage(@RequestBody DamageDTO damageDTO){
        if (damageDTO.getDamageID().trim().length() <= 0) {
            throw new NotFoundException("Damage id cannot be empty");
        }
        damageService.addDamage(damageDTO);
        return new ResponseEntity(new StandardResponce("201", "Done", damageDTO), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody DamageDTO damageDTO){

        if (damageDTO.getDamageID().trim().length() <= 0) {
            throw new NotFoundException("No id provided to update");
        }
        damageService.updateDamage(damageDTO);
        return new ResponseEntity(new StandardResponce("200", "Done", damageDTO), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity DeleteDamage(String id){

        damageService.deleteDamage(id);
        return new ResponseEntity(new StandardResponce("200", "Done", null), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllDamage(@RequestBody CustomerDTO dto){
        ArrayList<DamageDTO> allDamage = damageService.getAllDamage();
        return new ResponseEntity(new StandardResponce("200", "Done", allDamage), HttpStatus.OK);
    }
}
