package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("wild")
@RestController
public class WildCardMappingController {

    //wild/test/abc/hello - worked
    //wild/test/abc123/hello - worked

    //wild/test//hello - not worked
    //wild/test/123/hell - not worked
    //wild/test/abc123/de/hello - not worked
    @GetMapping("test/*/hello")
    public String hello() {
        return "hello";
    }

    //wild/hello/1/  - worked
    //wild/hello/1/1  - worked
    //wild/hello/123/123  - worked

    //wild/hello/123/123/  - not worked
    //wild/hello/123/123/de  - not worked
    @GetMapping("hello/*/*")
    public String hello1() {
        return "hello1";
    }
}
