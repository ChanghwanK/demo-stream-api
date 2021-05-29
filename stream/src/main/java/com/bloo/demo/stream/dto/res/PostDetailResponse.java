package com.bloo.demo.stream.dto.res;

import com.bloo.demo.stream.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Created by Bloo
 * @Date: 2021/05/30
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDetailResponse {

    private Long id;
    private String title;
    private String author;
    private String content;

    @Builder
    public PostDetailResponse ( Post post ) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.author = post.getAuthor();
        this.content = post.getContent();
    }
}
