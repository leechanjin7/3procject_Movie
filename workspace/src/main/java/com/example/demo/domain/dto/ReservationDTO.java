package com.example.demo.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
@Data
public class ReservationDTO {

    private int reservationId;
    private String userId;
    private int showtimeId;
    private int seatNumber;
    private Time reservationTime;
    private int priceTotal;
}
