package com.example.service.impl;

import com.example.service.HelloService;
import com.example.service.MemoryService;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Singleton
public class HelloServiceImpl implements HelloService {

    private final MemoryService memoryService;

    public HelloServiceImpl(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @Override
    public String readFromKafka() {
        ArrayList<String> memory = memoryService.getStore();
        String ret = memory.stream().collect(Collectors.joining(", "));
        return ret;
    }
}
