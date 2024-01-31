package com.myblog20.myblog20.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private long id;
    private String description;
    private String content;
    private String title;
}
