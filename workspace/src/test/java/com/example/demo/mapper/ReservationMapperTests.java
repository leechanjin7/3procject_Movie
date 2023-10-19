package com.example.demo.mapper;

import com.example.demo.domain.dto.ReserveDTO;
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

        ReserveDTO reserveDTO = new ReserveDTO();

        reserveDTO.setUserId("test1");
        reserveDTO.setShowtimeId(1);
        reserveDTO.setSeatNumber(1);
        reserveDTO.setReservationTime(Time.valueOf("12:22:00"));
        reserveDTO.setPriceTotal(40000);

        reservationMapper.reserveInsert(reserveDTO);
    }

    @Test
    public void reserveSelectTest(){

        ReserveDTO reserveDTO = new ReserveDTO();

        List<ReserveDTO> list = reservationMapper.reserveSelect(reserveDTO);

        System.out.println("결과 값 : " + list);





    }
}
