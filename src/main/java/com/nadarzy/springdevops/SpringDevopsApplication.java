package com.nadarzy.springdevops;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringDevopsApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDevopsApplication.class, args);
  }
}
