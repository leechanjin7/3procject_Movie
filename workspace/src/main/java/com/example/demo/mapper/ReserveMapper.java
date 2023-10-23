package com.example.demo.mapper;

import com.example.demo.domain.dto.ReserveDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveMapper {

    //결제정보DB에추가
    public void insertReserve(ReserveDTO reserveDTO);
}
