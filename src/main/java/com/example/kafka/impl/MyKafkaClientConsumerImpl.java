package com.example.kafka.impl;

import com.example.kafka.MyKafkaClientConsumer;
import com.example.service.MemoryService;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetStrategy;
import io.micronaut.configuration.kafka.annotation.Topic;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@KafkaListener(offsetStrategy = OffsetStrategy.SYNC_PER_RECORD)
public class MyKafkaClientConsumerImpl implements MyKafkaClientConsumer {

    private final MemoryService memoryService;

    public MyKafkaClientConsumerImpl(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @Override
    @Topic("my_events")
    public void readWhatEver(String message) {
        log.info("Message received: {}!", message);
        memoryService.store(message);
    }
}
