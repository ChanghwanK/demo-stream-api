package com.bloo.demo.stream.service;

import com.bloo.demo.stream.domain.PostRepository;
import com.bloo.demo.stream.dto.exception.PostNotFoundException;
import com.bloo.demo.stream.dto.res.PostDetailResponse;
import com.bloo.demo.stream.dto.res.PostSimpleResponse;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Created by Bloo
 * @Date: 2021/05/30
 */

@RequiredArgsConstructor
@Service
public class ApiPostService {

    private final PostRepository postRepository;

    public PostDetailResponse findPostDetail ( Long id ) {
        return postRepository.findById(id)
            .map(PostDetailResponse::new)
            .orElseThrow(PostNotFoundException::new);
    }

    public List<PostSimpleResponse> findAll () {
        return postRepository.findAll()
            .stream()
            .map(PostSimpleResponse::of)
            .collect(Collectors.toList());
    }
}
