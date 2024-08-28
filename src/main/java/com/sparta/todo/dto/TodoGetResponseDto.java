package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoGetResponseDto {

    private final Long id;
    private final String username;
    private final String title;
    private final String content;

    public TodoGetResponseDto(Long id, String username, String title, String content) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.content = content;
    }
}
