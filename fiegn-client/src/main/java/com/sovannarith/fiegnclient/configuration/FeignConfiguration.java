package com.sovannarith.fiegnclient.configuration;

import feign.Contract;
import feign.Logger;
import feign.codec.Encoder;
import feign.form.FormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration{
    @Bean
    public Logger.Level feignLoggerLever() {
        return Logger.Level.FULL;
    }

    @Bean
    public Encoder encoder() {
        return new FormEncoder();
    }

}
