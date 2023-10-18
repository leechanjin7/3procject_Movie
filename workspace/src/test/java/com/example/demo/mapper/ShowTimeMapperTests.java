package com.example.demo.mapper;

import com.example.demo.domain.dto.ShowtimeDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class ShowTimeMapperTests {

    @Autowired
    private ShowTimeMapper showTimeMapper;

    @Test
    public void selectShowTimesTest(){

        List<ShowtimeDTO> list = showTimeMapper.selectShowTimes();

        for(ShowtimeDTO showtimeDTO : list){
            System.out.println("theaterId : " + showtimeDTO.getTheaterId() + ", showTime : " + showtimeDTO.getShowTime());
        }
    }
}
