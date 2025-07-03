package org.example.controller;

import org.example.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("form")
public class FormURLDataController {
    @PostMapping("save")
    public String saveUser(@ModelAttribute UserDTO userDTO){
        System.out.println(userDTO);
        return "saveUser";
    }
}
