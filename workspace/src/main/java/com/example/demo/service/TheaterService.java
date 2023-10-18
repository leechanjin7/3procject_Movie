package com.example.demo.service;

import com.example.demo.domain.dto.TheaterDTO;
import com.example.demo.mapper.TheaterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TheaterService {

    private final TheaterMapper theaterMapper;

    //총 좌석 수 조회
    public List<TheaterDTO> totalSeats(){
        return theaterMapper.totalSeats();
    }


}
