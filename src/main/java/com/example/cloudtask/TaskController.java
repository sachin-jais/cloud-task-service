package com.example.cloudtask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class TaskController {

    @Value("${APP_ENV:local}")
    private String environment;

    @GetMapping("/")
    public Map<String, Object> root() {
        return Map.of(
            "service", "cloud-task-service",
            "status", "running",
            "environment", environment,
            "timestamp", Instant.now().toString()
        );
    }

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
            "message", "Containerized Maven microservice is healthy",
            "environment", environment
        );
    }
}
