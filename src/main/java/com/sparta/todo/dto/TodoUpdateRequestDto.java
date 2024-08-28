package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoUpdateRequestDto {
    private String username;
    private String title;
    private String content;
}
