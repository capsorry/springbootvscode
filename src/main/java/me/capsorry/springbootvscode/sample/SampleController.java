package me.capsorry.springbootvscode.sample;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Vsa Code!2";
    }
}