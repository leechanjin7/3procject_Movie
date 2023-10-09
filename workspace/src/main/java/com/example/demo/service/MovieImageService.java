package com.example.demo.service;

import com.example.demo.domain.dto.MovieImageDTO;
import com.example.demo.mapper.MovieImageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieImageService {

    private final MovieImageMapper movieImageMapper;

    //영화 조회
    public MovieImageDTO selectImage(int imgId) {
        return movieImageMapper.selectImage(imgId);
    }

}
