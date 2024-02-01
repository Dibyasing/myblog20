package com.myblog20.myblog20.Payload;

import lombok.Data;
@Data
public class CommentDto {

    private long id;
    private String text;
    private String email;
}
