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

    //영화관 조회
    public List<TheaterDTO> selectAll(TheaterDTO theaterDTO) {return theaterMapper.selectAll(theaterDTO);}

    //서울 영화관 조회
    public List<TheaterDTO> selectSeoul() {return theaterMapper.selectSeoul();}

    //경기 영화관 조회
    public List<TheaterDTO> selectGyeonggi() {return theaterMapper.selectGyeonggi();}

    //대구 영화관 조회
    public List<TheaterDTO> selectDaegu() {return theaterMapper.selectDaegu();}

    //경북 영화관 조회
    public List<TheaterDTO> selectGyeongbuk() {return theaterMapper.selectGyeongbuk();}

    //충청/대전 영화관 조회
    public List<TheaterDTO> selectDaejeon() {return theaterMapper.selectDaejeon();}

    //강원 영화관 조회
    public List<TheaterDTO> selectGangwon() {return theaterMapper.selectGangwon();}

    //제주 영화관 조회
    public List<TheaterDTO> selectJeju() {return theaterMapper.selectJeju();}
}
