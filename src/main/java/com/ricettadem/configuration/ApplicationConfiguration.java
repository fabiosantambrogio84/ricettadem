package com.ricettadem.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource(value = "application.propert.OLD", ignoreResourceNotFound = true)
@PropertySource(value = "file:${spring.config.location}/application.properties", ignoreResourceNotFound = true)
public class ApplicationConfiguration {

}
