package com.bloo.demo.stream.dto.exception;

/**
 * @Created by Bloo
 * @Date: 2021/05/30
 */

public class PostNotFoundException extends RuntimeException{
    private static final String MESSAGE = "조회 실패";
    public PostNotFoundException () {
        super (MESSAGE);
    }
}
