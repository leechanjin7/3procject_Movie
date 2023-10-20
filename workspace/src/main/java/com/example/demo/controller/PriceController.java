package com.example.demo.controller;

import com.example.demo.domain.dto.PriceDTO;
import com.example.demo.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @PostMapping("/getPrice")
    public ResponseEntity<Map<String, Object>> getPrice(@RequestBody Map<String, String> payload) {
        String age = payload.get("age");
        // Get price from DB based on age...
        PriceDTO price = priceService.getPriceByAge(age);
        Map<String, Object> response = new HashMap<>();
        response.put("price", price);
        return ResponseEntity.ok(response);
    }



}
