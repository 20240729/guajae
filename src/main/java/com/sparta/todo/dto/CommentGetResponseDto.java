package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class CommentGetResponseDto {
    private final Long id;
    private final String content;
    private final Long userId;

    public CommentGetResponseDto(Long id, String content, Long userId) {
        this.id = id;
        this.content = content;
        this.userId = userId;

    }
}
