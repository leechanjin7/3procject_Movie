package com.example.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterDTO {

    private int theaterId;
    private String theaterName;
    private String theaterLocation;
    private int totalSeats;

    private Time showTime;
}
