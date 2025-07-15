package org.example.controller;

import org.example.dto.UCity;
import org.example.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(value = "save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        return "saveUser";
    }

    @GetMapping(value = "get",produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setuId("U001");
        userDTO.setuName("User 001");
        userDTO.setuAddress("Address");
        userDTO.setuCity(new UCity("Panadura","13400"));
        return userDTO;
    }
}
