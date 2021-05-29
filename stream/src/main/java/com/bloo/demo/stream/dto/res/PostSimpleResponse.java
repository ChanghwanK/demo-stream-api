package com.bloo.demo.stream.dto.res;

import com.bloo.demo.stream.domain.Post;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Created by Bloo
 * @Date: 2021/05/30
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostSimpleResponse {

    private String title;
    private String author;

    public static PostSimpleResponse of ( Post post) {
        return new PostSimpleResponse(post.getTitle(), post.getAuthor());
    }

    public static List<PostSimpleResponse> listOf ( List<Post> posts ) {
        List<PostSimpleResponse> responses = new ArrayList<>();

        for ( Post post : posts) {
            responses.add(PostSimpleResponse.of(post));
        }

        return responses;
    }
}
