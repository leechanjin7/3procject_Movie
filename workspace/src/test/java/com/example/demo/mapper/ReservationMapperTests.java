package com.example.demo.mapper;

import com.example.demo.domain.dto.ReservationDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Time;
import java.util.List;

@SpringBootTest
@Slf4j
public class ReservationMapperTests {

    @Autowired
    private ReservationMapper reservationMapper;

    @Test
    public void reserveInsertTest(){

        ReservationDTO reservationDTO = new ReservationDTO();

        reservationDTO.setUserId("test1");
        reservationDTO.setShowtimeId(1);
        reservationDTO.setSeatNumber(1);
        reservationDTO.setReservationTime(Time.valueOf("12:22:00"));
        reservationDTO.setPriceTotal(40000);

        reservationMapper.reserveInsert(reservationDTO);
    }

    @Test
    public void reserveSelectTest(){

        ReservationDTO reservationDTO = new ReservationDTO();

        List<ReservationDTO> list = reservationMapper.reserveSelect(reservationDTO);

        System.out.println("결과 값 : " + list);





    }
}
