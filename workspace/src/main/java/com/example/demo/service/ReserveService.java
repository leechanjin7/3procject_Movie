package com.example.demo.service;

import com.example.demo.domain.dto.ReserveDTO;
import com.example.demo.mapper.ReserveMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReserveService {

    private final ReserveMapper reserveMapper;

    //결제내역 DB 저장
    public void insertReserve(ReserveDTO reserveDTO){
        reserveMapper.insertReserve(reserveDTO);
    }
}
