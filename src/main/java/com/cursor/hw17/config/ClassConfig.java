package com.cursor.hw17.config;

import com.cursor.hw17.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ClassConfig {

    @Bean
    public Timer timer() {
        return new Timer();
    }
}
