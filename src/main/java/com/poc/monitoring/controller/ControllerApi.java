package com.poc.monitoring.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class ControllerApi {

  @GetMapping("monitor")
  public String monitor() {
    log.info("Bateu no monitor");
    return "Hello World";
  }

  @GetMapping("error")
  public String monitorError() {
    log.info("Bateu no ERRO do monitor");
    String a = null;
    return a.toLowerCase();
  }
}
