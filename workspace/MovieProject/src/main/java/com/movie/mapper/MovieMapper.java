package com.movie.mapper;

import java.util.List;

import com.movie.domain.dto.MovieDTO;

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
