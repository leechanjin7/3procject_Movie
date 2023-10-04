package com.example.demo.service;

import com.example.demo.domain.dto.MovieDTO;
import com.example.demo.domain.dto.MovieImageDTO;
import com.example.demo.mapper.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final MovieMapper movieMapper;

    //영화 추가
    @Transactional
    public void movie_insert(List<MovieDTO> movies) {
        movieMapper.movie_insert(movies);
    }

    //영화 이미지 추가
    @Transactional
    public void movie_image_insert(List<MovieImageDTO> movieImage) {
        movieMapper.movie_image_insert(movieImage);
    }
}
