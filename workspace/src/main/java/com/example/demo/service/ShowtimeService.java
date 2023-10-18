package com.example.demo.service;

import com.example.demo.domain.dto.ShowtimeDTO;
import com.example.demo.mapper.ShowtimeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowtimeService {

    private final ShowtimeMapper showtimeMapper;

    //상영시간 전체 조회
    public List<ShowtimeDTO> selectAll(ShowtimeDTO showtimeDTO) {
        return showtimeMapper.selectAll(showtimeDTO);
    }
}
