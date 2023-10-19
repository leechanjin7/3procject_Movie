package com.example.demo.mapper;

import com.example.demo.domain.dto.CinemaDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class TheaterMapperTests {

    @Autowired
    private TheaterMapper theaterMapper;

    //총 좌석수 조회 테스트
    @Test
    public void totalSeatsTest(){

        List<CinemaDTO> list = theaterMapper.totalSeats();

        for(CinemaDTO cinemaDTO : list) {
            System.out.println("영화 제목 : " + cinemaDTO.getTheaterName() + ", 영화 총 좌석수 : " + cinemaDTO.getTotalSeats());
        }
    }

    @Test
    public void testSelectAllTheaterShowTime() {
        List<CinemaDTO> theaterShowTimes = theaterMapper.selectAllTheaterShowTime();
        for (CinemaDTO theater : theaterShowTimes) {
            System.out.println("극장 이름: " + theater.getTheaterName());
            System.out.println("상영 시간: " + theater.getShowTime());
            System.out.println();
        }
    }
}
