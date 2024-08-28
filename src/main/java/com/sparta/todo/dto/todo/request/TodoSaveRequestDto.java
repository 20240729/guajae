package com.sparta.todo.dto.todo.request;

import lombok.Getter;

@Getter
public class TodoSaveRequestDto {
    private String username;
    private String title;
    private String content;
    private String password;
}

