package com.qmiki.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Muzya on 03.02.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.qmiki")
public class WebConfig extends WebMvcConfigurerAdapter{

}
