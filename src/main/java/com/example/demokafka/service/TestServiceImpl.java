package com.example.demokafka.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements  TestService{

    public int sum(int a) {

        if (a > 6) {
            return a;
        } else {
            return a * a;
        }
    }
}
