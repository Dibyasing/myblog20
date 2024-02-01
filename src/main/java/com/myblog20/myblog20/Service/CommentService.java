package com.myblog20.myblog20.Service;

import com.myblog20.myblog20.Payload.CommentDto;

public interface CommentService {

     

    CommentDto createComment(CommentDto commentDto, long postid);

    void deletecomment(long id);

    CommentDto updateComment(long id, CommentDto commentDto, long postId);
}

