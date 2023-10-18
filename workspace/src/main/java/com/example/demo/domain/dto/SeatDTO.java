package com.example.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatDTO {

    private int seatId;
    private int theaterId;
    private int seatNumber;
    private String rowNumber;
}
