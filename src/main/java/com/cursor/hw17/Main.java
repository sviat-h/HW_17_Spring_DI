package com.cursor.hw17;

import com.cursor.hw17.config.ClassConfig;
import com.cursor.hw17.model.Timer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);

        context.getBean(Timer.class).showRealTime();
    }
}
