package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("param")
public class ParamController {
    @GetMapping(params = {"id"})
    public String hello9(@RequestParam("id") String id) {
        return "hello9 : " +id;
    }
    @GetMapping(params = {"id","name"})
    public String hello10(@RequestParam("id") String id,@RequestParam("name") String name) {
        return "hello10 : " +id + ", "+name;
    }
    @GetMapping(path = {"code"}, params = {"id","name"})
    public String hello11(@PathVariable("code")String code,
                          @RequestParam("id") String id,
                          @RequestParam("name") String name) {
        return "hello11 : " +code+id+name;
    }

}
