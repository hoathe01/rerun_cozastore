package com.huynhthehoa.cozastore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class HelloController {
    @GetMapping
    public ResponseEntity<?> getHello(){
        return ResponseEntity.ok("HEllO WORLD");
    }

}
