package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoSaveResponseDto {

    private final String username;
    private final String title;
    private final String content;

    public TodoSaveResponseDto(String username, String title, String content) {
        this.username = username;
        this.title = title;
        this.content = content;
    }
}
