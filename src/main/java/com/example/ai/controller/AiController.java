package com.example.ai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
// @RequestMapping("/api/generate")
// @CrossOrigin(origins = "*")
@CrossOrigin(origins = "https://rukahtka.github.io")
public class AiController {

    @GetMapping("/shayari")
    public ResponseEntity<?> generateShayari() {
        Map<String, String> response = new HashMap<>();
        response.put("result", "Ek chandni raat mein, tanha safar ka sathi tu...");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/poem")
    public ResponseEntity<?> generatePoem() {
        Map<String, String> response = new HashMap<>();
        response.put("result", "The sky whispers blue in hues unknown, A dreamer writes with heart alone.");
        return ResponseEntity.ok(response);
    }
}
