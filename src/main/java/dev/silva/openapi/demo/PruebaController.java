package dev.silva.openapi.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test") public class PruebaController {

    public String getAll(){
        return "all";
    }

    @PostMapping
    public  String create(@RequestBody String test){
        return test;
    }

}
