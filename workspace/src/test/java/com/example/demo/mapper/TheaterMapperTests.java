package com.example.demo.mapper;

import com.example.demo.domain.dto.TheaterDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class TheaterMapperTests {

    @Autowired
    private TheaterMapper theaterMapper;

    //총 좌석수 조회 테스트
    @Test
    public void totalSeatsTest(){

        TheaterDTO theaterDTO = new TheaterDTO();
        List<TheaterDTO> list = theaterMapper.totalSeats(theaterDTO);

        System.out.println("결과 값 : " + list);

    }
}
