package com.myblog20.myblog20.Service;

import com.myblog20.myblog20.Payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createpost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPosts();

    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
