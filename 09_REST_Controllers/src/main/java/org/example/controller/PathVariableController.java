package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("path")
@RestController
public class PathVariableController {
    //path/12
    @GetMapping(path = "{id}")
    public String hello4(@PathVariable("id") String name) {
        return name;
    }
    //path/udara/65
    @GetMapping(path = "{name}/{age}")
    public String hello5(@PathVariable ("name")String name, @PathVariable("age")int age) {
        return "Name : " + name + ", Age : " + age;
    }
    //path/customer/I001
    @GetMapping(path = "customer/{id:[I][0-9]{3}}")
    public String hello6(@PathVariable("id") String id) {
        return "hello6 : "+ id;
    }
    //path/item/I002/branch/panadura
    @GetMapping(path = "item/{code}/branch/{city}")
    public String hello7(@PathVariable("code")  String code,
                         @PathVariable("city") String city) {
        return "hello7 : "+ code + ", " + city;
    }
    //path/item/I002/branch/panadura
    @GetMapping(path = "items/{code:[I][0-9]{3}}/branch/{city}")
    public String hello8(@PathVariable("code")  String code,
                         @PathVariable("city") String city) {
        return "hello8 : "+ code + ", " + city;
    }
}
