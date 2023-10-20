package com.example.demo.mapper;

import com.example.demo.domain.dto.PlayMovieDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlayMovieMapper {

    //상영 영화 전체 조회
    public List<PlayMovieDTO> selectPlayMovie();



}
