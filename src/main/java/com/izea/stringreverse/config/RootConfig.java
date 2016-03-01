package com.izea.stringreverse.config;

/**
 * Created by dvelma on 2/25/2016.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.izea")
public class RootConfig {
}
