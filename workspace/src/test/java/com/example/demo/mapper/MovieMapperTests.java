package com.example.demo.mapper;

import com.example.demo.domain.dto.MovieDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class MovieMapperTests {

	@Autowired
	MovieMapper movieMapper;

	//영화조회
	@Test
	public void selectTest() {


		MovieDTO movieDTO = movieMapper.select(5);

		System.out.println("결과 값 : " + movieDTO);
	}

    //영화추가
//	@Test
//	public void insertTest() {
//
//		MovieDTO movie = new MovieDTO();
//
//		movie.setMovieName("테스트제목");
//		movie.setMovieInfo("테스트인포");
//		movie.setMovieRating("7");
//		movie.setMovieType("테스트타입");
//		movie.setMovieRelease("테스트릴리즈");
//
//		movieMapper.insert(movie);
//	}

//    @Test
//    public void selectTest() {
//
//        int movieId = 27;
//
//        MovieDTO result = movieMapper.select(movieId);
//        System.out.println("==============================");
//        System.out.println(result);
//        System.out.println("==============================");
//
//
//    }
//
//	@Test
//	public void deleteTest() {
//
//
//		movieMapper.delete(62);
//	}

}

