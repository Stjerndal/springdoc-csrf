package com.example.springdoccsrf;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @PostMapping("/post")
    public ResponseEntity<String> postExample() {
        return ResponseEntity.ok("Successful post");
    }

    @GetMapping("/get")
    public ResponseEntity<String> getExample() {
        return ResponseEntity.ok("Successful get");
    }
}
