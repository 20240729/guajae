package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class CommentSaveResponseDto {
    private final String content;
    private final Long userId;

    public CommentSaveResponseDto(String content, Long userId) {
        this.content = content;
        this.userId = userId;
    }
}
