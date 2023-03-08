package com.example.service;

import java.util.ArrayList;

public interface MemoryService {

    void store(String obj);

    void printStore();

    ArrayList<String> getStore();
}
