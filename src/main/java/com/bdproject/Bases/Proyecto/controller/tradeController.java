package com.bdproject.Bases.Proyecto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tradeController {

    @GetMapping("/trade")
    public ResponseEntity<String> metersHouse(){
        return new ResponseEntity<>("Probando", HttpStatus.OK);
    }
}
