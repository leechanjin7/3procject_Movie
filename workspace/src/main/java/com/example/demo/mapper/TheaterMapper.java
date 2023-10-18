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

    //영화관 조회
    public List<TheaterDTO> selectAll(TheaterDTO theaterDTO);

    //서울 영화관 조회
    public List<TheaterDTO> selectSeoul();

    //경기 영화관 조회
    public List<TheaterDTO> selectGyeonggi();

    //대구 영화관 조회
    public List<TheaterDTO> selectDaegu();

    //경북 영화관 조회
    public List<TheaterDTO> selectGyeongbuk();

    //충청/대전 영화관 조회
    public List<TheaterDTO> selectDaejeon();

    //강원 영화관 조회
    public List<TheaterDTO> selectGangwon();

    //제주 영화관 조회
    public List<TheaterDTO> selectJeju();

}
