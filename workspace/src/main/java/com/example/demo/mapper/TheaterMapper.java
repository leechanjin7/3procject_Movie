package com.example.demo.mapper;

import com.example.demo.domain.dto.TheaterDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TheaterMapper {

    //총 좌석수 조회
    public List<TheaterDTO> totalSeats();

    //각 극장마다의 상영시간 조회
    public List<TheaterDTO> selectAllTheaterShowTime();

}
