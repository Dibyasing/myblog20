package com.myblog20.myblog20.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ErrorDetails {

    private String message;
    private Date date;
    private String url;
}
