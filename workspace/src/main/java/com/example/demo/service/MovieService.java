package com.example.demo.service;

import com.example.demo.domain.dto.MovieDTO;
import com.example.demo.domain.paging.Criteria;
import com.example.demo.domain.paging.PageMakerDTO;
import com.example.demo.mapper.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieMapper movieMapper;

    //영화 목록
    public List<MovieDTO> getList(){
        return movieMapper.getList();
    }

    //영화 목록(페이징 적용)
    public List<MovieDTO> getListPaging(Criteria criteria){
        return movieMapper.getListPaging(criteria);
    }

    //영화 총 개수
    public int getTotal(){
        return movieMapper.getTotal();
    }





}
