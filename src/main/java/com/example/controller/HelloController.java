package com.example.controller;

import com.example.service.HelloService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(com.example.service.HelloService helloService) {
        this.helloService = helloService;
    }

    @Get
    public HttpResponse<String> hi() {
        return HttpResponse.ok(helloService.readFromKafka());
    }
}
