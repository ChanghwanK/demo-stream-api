package com.bloo.demo.stream.service;

import static org.junit.jupiter.api.Assertions.*;

import com.bloo.demo.stream.domain.Post;
import com.bloo.demo.stream.domain.PostRepository;
import com.bloo.demo.stream.dto.res.PostDetailResponse;
import com.bloo.demo.stream.dto.res.PostSimpleResponse;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Created by Bloo
 * @Date: 2021/05/30
 */

@SpringBootTest
class ApiPostServiceTest {

    @Autowired
    private ApiPostService postService;

    @Autowired
    private PostRepository postRepository;

    @DisplayName ("")
    @Test
    void findAll () {
        // given
        Post post_01 = Post.builder()
            .author("martin")
            .title("Spring Boot")
            .content("Hello Spring Boot")
            .build();

        Post post_02 = Post.builder()
            .author("John")
            .title("Maria DB")
            .content("Hello Maria DB")
            .build();

        postRepository.saveAll(List.of(post_01, post_02));

        // when
        postRepository.findAll().forEach(System.out::println);
        System.out.println("----------------");
        System.out.println("----------------");

        List<PostSimpleResponse> responses = postService.findAll();
        responses.forEach(System.out::println);

        System.out.println("----------------");
        System.out.println("----------------");

        PostDetailResponse postDetailResponse = postService.findPostDetail(1L);
        System.out.println(postDetailResponse);
    }


}