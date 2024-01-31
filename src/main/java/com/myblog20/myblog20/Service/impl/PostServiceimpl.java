package com.myblog20.myblog20.Service.impl;

import com.myblog20.myblog20.Entity.Post;
import com.myblog20.myblog20.Payload.PostDto;
import com.myblog20.myblog20.Repository.PostRepository;
import com.myblog20.myblog20.Service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceimpl implements PostService {

    private PostRepository postRepository;

    public PostServiceimpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createpost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post save = postRepository.save(post);


        PostDto dto=new PostDto();
        dto.setTitle(save.getTitle());
        dto.setDescription(save.getDescription());
        dto.setContent(save.getContent());

        return null;
    }


}
