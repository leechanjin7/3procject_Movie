package com.example.demo.mapper;


import com.example.demo.domain.dto.MovieDTO;
import com.example.demo.domain.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {

    //영화조회(단건)
    public MovieDTO select(int movieId);

    //영화전체조회
    public List<MovieDTO> selectAll(MovieDTO movieDTO);

    //영화목록조회(전체)
    public List<MovieDTO> getList();

    //영화목록(페이징적용)
    public List<MovieDTO> getListPaging(Criteria criteria);

    public int getTotal();



}