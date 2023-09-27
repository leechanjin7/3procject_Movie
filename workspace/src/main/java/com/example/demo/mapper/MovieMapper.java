package com.example.demo.mapper;


import com.example.demo.domain.dto.MovieDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MovieMapper {

    //영화조회(단건)
    public MovieDTO select(int movieId);

    //영화조회(전체)
    public List<MovieDTO> selectAll();

    //영화추가
    public void insert(MovieDTO movieDTO);

    //영화수정
    public void update(MovieDTO movieDTO);

    //영화삭제
    public void delete(int movieId);

}