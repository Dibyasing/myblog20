package com.myblog20.myblog20.Controller;

import com.myblog20.myblog20.Payload.PostDto;
import com.myblog20.myblog20.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public ResponseEntity<PostDto>createpost(@RequestBody PostDto postDto){
        PostDto dto = postService.createpost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/posts?id=1
    @GetMapping("{id}")
    public ResponseEntity<PostDto>getPostById(@RequestParam long id){
        PostDto dto = postService.getPostById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @GetMapping
    public List<PostDto>getAllPosts(){
        List<PostDto> postDtos=postService.getAllPosts();
        return postDtos;
    }
}
