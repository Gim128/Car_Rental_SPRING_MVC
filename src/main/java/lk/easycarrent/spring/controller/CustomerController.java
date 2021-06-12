package lk.easycarrent.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/easycarrent/customer")
public class CustomerController {

    @GetMapping
    public String customer(){
        return "hello c";
    }
}
