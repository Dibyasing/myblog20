package com.myblog20.myblog20.Controller;

import com.myblog20.myblog20.Payload.PostDto;
import com.myblog20.myblog20.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    public ResponseEntity<PostDto>createpost(@RequestBody PostDto postDto){
        PostDto dto = postService.createpost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
