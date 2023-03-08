package com.example.service.impl;

import com.example.service.MemoryService;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Singleton
public class MemoryServiceImpl implements MemoryService {

    private final ArrayList<String> store;

    public MemoryServiceImpl(ArrayList<String> store) {
        this.store = store;
    }

    @Override
    public void store(String obj) {
        store.add(obj);
        log.info("Object stored in memory! {}", obj);
        printStore();
    }

    @Override
    public void printStore(){
        store.stream().peek(a -> log.info("Element of the store: {}", a.toString()));
    }

    @Override
    public ArrayList<String> getStore() {
        return store;
    }


}
