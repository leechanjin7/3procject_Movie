package com.example.demo.controller;

import com.example.demo.domain.dto.PlayMovieDTO;
import com.example.demo.domain.dto.TheaterDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class ReservationController {


    @GetMapping("/reservation")
    public void GETReservation(Model model) {

        log.info("예매 페이지 진입");
    }
}
