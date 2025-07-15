package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO) {
        return true;
    }
    @GetMapping("all")
    public ArrayList<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
