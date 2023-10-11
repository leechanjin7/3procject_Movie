package com.example.demo.controller.admin;

import com.example.demo.domain.paging.Criteria;
import com.example.demo.domain.paging.PageMakerDTO;
import com.example.demo.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @Autowired
    private AdminService adminService;

    //관리자 메인페이지 이동
    @GetMapping("/main")
    public void GETMain(){

        log.info("관리자 페이지 진입");

    }

    //영화 관리(목록) 페이지
    @GetMapping("/movieManage")
    public void GETMovieList(Model model, Criteria criteria){
//        log.info("GETMovieList 진입 ");

        model.addAttribute("list", adminService.movieGetList(criteria));

        int total = adminService.movieGetTotal();
        PageMakerDTO pageMaker = new PageMakerDTO(criteria, total);
        model.addAttribute("pageMaker", pageMaker);
    }

    //영화 등록 페이지
    @GetMapping("/movieEnroll")
    public void GETMovieEnroll(){

    }
}
