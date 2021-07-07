package com.cursor.hw17.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Timer {
    @Value("${timer.enabled:true}")
    private boolean isEnabled;

    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

    @Scheduled(cron = "0/5 * * * * *")
    public void showRealTime() {
        if (isEnabled) {
            System.out.println(LocalTime.now().format(timeFormatter));
        } else {
            System.exit(0);
        }
    }
}
