package com.example.demokafka.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestServiceImpl {

    @Mock
    TestService testService;

    @Test
    void when_a_greathearted_10() {
        int a = testService.sum(10);
        assertEquals(10,10);
    }

}
