package com.example.demo.mapper;

import com.example.demo.domain.dto.ShowtimeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShowTimeMapper {

    //예매시간선택
    public List<ShowtimeDTO> selectShowTimes();
}
