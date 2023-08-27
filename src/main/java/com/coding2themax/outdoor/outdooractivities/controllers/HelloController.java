package com.coding2themax.outdoor.outdooractivities.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
@OpenAPIDefinition(info = @Info(title = "outdoor"))
public class HelloController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "get hello") })
  public Mono<String> getHello() {
    return Mono.just("Hello World");
  }
}
