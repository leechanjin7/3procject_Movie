package com.example.demo.controller;

import com.example.demo.domain.dto.ReserveDTO;
import com.example.demo.service.ReserveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ReserveController {

    @Autowired
    private ReserveService reserveService;

    @PostMapping("/reserve")
    public void reserve(@RequestBody ReserveDTO reserveDTO){

        reserveService.insertReserve(reserveDTO);
        log.info("결제내용 추가 성공");
    }
}
