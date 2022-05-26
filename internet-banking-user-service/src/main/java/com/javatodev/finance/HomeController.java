package com.javatodev.finance;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/v1")
public class HomeController {
    private class HomeMessage{
        private String message = "User Service Home Controller. Random UUID: " + UUID.randomUUID();

        public String getMessage() {
            return message;
        }
    }

    @GetMapping
    public ResponseEntity<?> home() {
        List<HomeMessage> msgs = new ArrayList<>();
        msgs.add(new HomeMessage());

        return ResponseEntity.ok(msgs);
    }
}
