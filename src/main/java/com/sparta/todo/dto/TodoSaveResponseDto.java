package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoSaveResponseDto {

    private final String username;
    private final String title;
    private final String content;
    private final String password;

    public TodoSaveResponseDto(String username, String title, String content, String password) {
        this.username = username;
        this.title = title;
        this.content = content;
        this.password = password;
    }
}
