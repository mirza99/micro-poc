package com.meligys.main;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Main app.
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.meligys.controller",
								"com.meligys.service",
								"com.meligys.domain",
								"com.meligys.data",
								"com.meligys.provider"})
@PropertySource("classpath:application.properties")
public class App implements WebMvcConfigurer  {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(App.class, args);
  }
  
}
