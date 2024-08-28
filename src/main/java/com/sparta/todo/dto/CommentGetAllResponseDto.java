package com.sparta.todo.dto;

import lombok.Getter;

import java.io.FileInputStream;

@Getter
public class CommentGetAllResponseDto {
    private final Long id;
    private final String title;
    private final Long userId;

    public CommentGetAllResponseDto(final Long id, final String title, final Long userId) {
        this.id = id;
        this.title = title;
        this.userId = userId;
    }
}
