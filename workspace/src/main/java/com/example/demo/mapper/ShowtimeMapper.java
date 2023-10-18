package com.example.demo.mapper;

import com.example.demo.domain.dto.ShowtimeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShowtimeMapper {

    //상영시간 전체 조회
    public List<ShowtimeDTO> selectAll(ShowtimeDTO showtimeDTO);
}
