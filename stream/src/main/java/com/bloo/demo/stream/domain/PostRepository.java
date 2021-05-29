package com.bloo.demo.stream.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Created by Bloo
 * @Date: 2021/05/30
 */


public interface PostRepository extends JpaRepository<Post, Long> {

}
