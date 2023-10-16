package com.example.demo.mapper;

import com.example.demo.domain.dto.ReservationDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservationMapper {

    //예매 정보 등록
    public void reserveInsert(ReservationDTO reservationDTO);

    //예매 정보 수정??

    //예매 정보 조회
    public List<ReservationDTO> reserveSelect(ReservationDTO reservationDTO);

    //예매 취소

}
