package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoGetResponseDto {

    private final Long id;
    private final String title;
    private final String content;

    public TodoGetResponseDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
