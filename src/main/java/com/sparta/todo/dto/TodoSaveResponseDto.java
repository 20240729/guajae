package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoSaveResponseDto {

    private final String title;
    private final String content;

    public TodoSaveResponseDto( String title, String content) {
        this.title = title;
        this.content = content;
    }
}
