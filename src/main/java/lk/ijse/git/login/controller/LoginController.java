package lk.ijse.git.login.controller;

import lk.ijse.git.login.dto.CustomerDTO;
import lk.ijse.git.login.entity.Customer;
import lk.ijse.git.login.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/login")
public class LoginController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody CustomerDTO customerDTO){
        System.out.println("login cus controller");
        return customerService.canAuthenticate(customerDTO.getUserName(), customerDTO.getPassword());
    }
}
