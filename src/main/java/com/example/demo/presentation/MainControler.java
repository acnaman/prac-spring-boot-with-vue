package com.example.demo.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControler {
  
  @GetMapping
  public String topPage() {
    return "top";
  }
}
