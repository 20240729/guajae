package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoUpdateResponseDto {
    private final String title;
    private final String content;

    public TodoUpdateResponseDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
