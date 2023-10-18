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
public class ShowtimeDTO {

    private int showTimeId;
    private int theaterId;
    private Time showTime;

}
