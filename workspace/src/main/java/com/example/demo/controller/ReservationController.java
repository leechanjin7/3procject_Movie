package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@Slf4j
public class ReservationController {

    @GetMapping("/reservation")
    public void GETReservation(){
        log.info("예매 페이지 진입");

    }
}
