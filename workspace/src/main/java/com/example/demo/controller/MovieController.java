package com.example.demo.controller;

import com.example.demo.domain.dto.MovieDTO;
import com.example.demo.domain.paging.Criteria;
import com.example.demo.domain.paging.PageMakerDTO;
import com.example.demo.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.awt.print.Pageable;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MovieController {

    private final MovieService movieService;


//    @GetMapping("/main")
//    public String GETMainPage() {
//
//        log.info("메인 페이지 진입");
//
//        return "main";
//    }

//    //영화목록
//    @GetMapping("/movielist")
//    public String GETMovie(Model model){
//
//        List<MovieDTO> movieList = movieService.getList();
//        model.addAttribute("list", movieList);
//        return "/movielist";
//    }


    //영화목록 페이지 접속(페이징 적용)
    @GetMapping("/movielist")
    public void GETMovieList(Model model, Criteria criteria){
//        log.info("GETMovieList 진입 ");

        model.addAttribute("list", movieService.getListPaging(criteria));

        int total = movieService.getTotal();
        PageMakerDTO pageMaker = new PageMakerDTO(criteria, total);
        model.addAttribute("pageMaker", pageMaker);
    }




}

