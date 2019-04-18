package me.capsorry.springbootvscode.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private static final String HELLO_VS_CODE = "Hello VS Code";

    @GetMapping("/hello")
    public String hello() {
        return HELLO_VS_CODE;
    }
}