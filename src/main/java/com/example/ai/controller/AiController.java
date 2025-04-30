package com.example.ai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import java.util.List;
import java.util.Random;

@RestController
// @RequestMapping("/api/generate")
// @CrossOrigin(origins = "*")
@CrossOrigin(origins = "https://rukahtka.github.io")
public class AiController {


    private final List<String> shayaris = List.of(
        "Dosti har chehra mehka deti hai,\nHar raasta asaan bana deti hai.",
        "Sacha dost wahi hota hai jo andhere mein roshni ban jaaye.",
        "Jab koi dost paas hota hai,\nZindagi kuch khaas hoti hai.",
        "Dost hi toh hote hain jo muskurane ki wajah ban jaate hain.",
        "Zindagi mein sab kuch mil jaata hai,\nPar sachcha dost dobara nahi milta."
    );

    private final List<String> poems = List.of(
        "Friendship is a quiet walk in the park,\nA laugh in the dark, a hopeful spark.",
        "A friend is a light when the world turns gray,\nA shoulder to lean on at the end of the day.",
        "Friendship weaves hearts with invisible thread,\nStronger than words that are said.",
        "In every season, come rain or shine,\nA true friend's presence says, 'You're not alone, you're mine.'",
        "Through life's winding, stormy bends,\nWe find our peace in loving friends."
    );


    // @GetMapping("/shayari")
    // public ResponseEntity<?> generateShayari() {
    //     Map<String, String> response = new HashMap<>();
    //     response.put("result", "Ek chandni raat mein, tanha safar ka sathi tu...");
    //     return ResponseEntity.ok(response);
    // }

    // @GetMapping("/poem")
    // public ResponseEntity<?> generatePoem() {
    //     Map<String, String> response = new HashMap<>();
    //     response.put("result", "The sky whispers blue in hues unknown, A dreamer writes with heart alone.");
    //     return ResponseEntity.ok(response);
    // }


    private final Random random = new Random();

    @GetMapping("/shayari")
    public Response getShayari() {
        String selected = shayaris.get(random.nextInt(shayaris.size()));
        return new Response(selected);
    }

    @GetMapping("/poem")
    public Response getPoem() {
        String selected = poems.get(random.nextInt(poems.size()));
        return new Response(selected);
    }

    // Response class to wrap the message
    public static class Response {
        private String result;

        public Response(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }


}
