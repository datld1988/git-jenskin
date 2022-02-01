package com.example.demokafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EmployeeController {
    @GetMapping("/")
    String one() {

        log.info("OK");
        return "Home";
    }
}
