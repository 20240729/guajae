package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class TodoUpdateResponseDto {
    private final String username;
    private final String title;
    private final String content;

    public TodoUpdateResponseDto(
            String username, String title, String content
    ) {
        this.username = username;
        this.title = title;
        this.content = content;
    }
}
