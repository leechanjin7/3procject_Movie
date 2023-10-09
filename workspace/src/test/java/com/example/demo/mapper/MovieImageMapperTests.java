package com.example.demo.mapper;

import com.example.demo.domain.dto.MovieDTO;
import com.example.demo.domain.dto.MovieImageDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j

public class MovieImageMapperTests {

    @Autowired
    MovieImageMapper movieImageMapper;

    @Test
    public void selectImageTest(){

        MovieImageDTO movieImageDTO = movieImageMapper.selectImage(5);

        System.out.println("결과값 : " + movieImageDTO );
    }

    @Test
    public void selectRatingImageTest(){

        int imgId = 27;

        MovieImageDTO result = movieImageMapper.selectRatingImage(imgId);
        System.out.println("==============================");
        System.out.println(result);
        System.out.println("==============================");


    }
}
