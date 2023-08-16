package com.coding2themax.outdoor.outdooractivities.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<String> getHello() {
    return Mono.just("Hello World");
  }
}
