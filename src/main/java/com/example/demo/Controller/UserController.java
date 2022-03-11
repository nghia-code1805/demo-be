package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/v1")
@RestController
public class UserController {
    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return new ResponseEntity<>("Hello world",HttpStatus.OK);
    }
}
