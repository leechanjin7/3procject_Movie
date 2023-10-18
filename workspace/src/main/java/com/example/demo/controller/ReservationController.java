package com.example.demo.controller;

import com.example.demo.domain.dto.MovieImageDTO;
import com.example.demo.domain.dto.ShowtimeDTO;
import com.example.demo.domain.dto.TheaterDTO;
import com.example.demo.service.MovieImageService;
import com.example.demo.service.ShowtimeService;
import com.example.demo.service.TheaterService;
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

    private final TheaterService theaterService;

    private final ShowtimeService showtimeService;

    @GetMapping("/reservation")
    public void GETReservation(Model model, ShowtimeDTO showtimeDTO) {
        //특정 지역 영화관
        List<TheaterDTO> Slist = theaterService.selectSeoul();
        List<TheaterDTO> GGlist = theaterService.selectGyeonggi();
        List<TheaterDTO> Dlist = theaterService.selectDaegu();
        List<TheaterDTO> GBlist = theaterService.selectGyeongbuk();
        List<TheaterDTO> CDlist = theaterService.selectDaejeon();
        List<TheaterDTO> GAlist = theaterService.selectGangwon();
        List<TheaterDTO> Jlist = theaterService.selectJeju();

        //모델에 담기
        model.addAttribute("Slist", Slist);
        model.addAttribute("GGlist", GGlist);
        model.addAttribute("Dlist", Dlist);
        model.addAttribute("GBlist", GBlist);
        model.addAttribute("CDlist", CDlist);
        model.addAttribute("GAlist", GAlist);
        model.addAttribute("Jlist", Jlist);

        //상영시간
        List<ShowtimeDTO> timeList = showtimeService.selectAll(showtimeDTO);
        //모델에 담기
        model.addAttribute("timeList", timeList);
        System.out.println("timelist : " + timeList);

        log.info("예매 페이지 진입");
    }
}
