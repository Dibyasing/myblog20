package com.myblog20.myblog20.Service.impl;

import com.myblog20.myblog20.Entity.Post;
import com.myblog20.myblog20.Exception.ResourceNotFoundException;
import com.myblog20.myblog20.Payload.PostDto;
import com.myblog20.myblog20.Repository.PostRepository;
import com.myblog20.myblog20.Service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostServiceimpl implements PostService {


    private PostRepository postRepository;

    private ModelMapper modelMapper;

    public PostServiceimpl(PostRepository postRepository,ModelMapper modelMapper) {

        this.postRepository = postRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public PostDto createpost(PostDto postDto) {
        Post post = mapToEntity(postDto);

        Post save = postRepository.save(post);


        PostDto dto = mapToDto(save);
        return null;
    }

    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post not found :" + id)
        );
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<Post> post = postRepository.findAll();
        List<PostDto> dtos = post.stream().map(posts -> mapToDto(posts)).collect(Collectors.toList());
        return dtos;
    }

    PostDto mapToDto(Post post) {
        PostDto dto =modelMapper.map(post,PostDto.class);
        return dto;
    }

    Post mapToEntity(PostDto postDto) {
        Post post =modelMapper.map(postDto,Post.class);
        return post;
    }
}