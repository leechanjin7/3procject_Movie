package com.example.demo.service;

import com.example.demo.domain.dto.PlayMovieDTO;
import com.example.demo.mapper.PlayMovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayMovieService {

    private final PlayMovieMapper playMovieMapper;

    public List<PlayMovieDTO> selectPlayMovie() {
        return playMovieMapper.selectPlayMovie();
    }
}
