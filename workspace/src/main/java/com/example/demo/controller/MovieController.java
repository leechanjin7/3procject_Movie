package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MovieController {


    @GetMapping("/main")
    public String GETMainPage() {

        log.info("메인 페이지 진입");

        return "main";
    }

}
