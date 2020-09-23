package com.example.docker_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {
    @GetMapping("index")
    public ResponseEntity<?> index(){
        return ResponseEntity.ok().body("Hello Docker");
    }
}
