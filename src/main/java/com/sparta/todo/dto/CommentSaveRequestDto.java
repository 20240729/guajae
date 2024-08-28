package com.sparta.todo.dto;

import lombok.Getter;

@Getter
public class CommentSaveRequestDto {
    private String content;
    private Long userId;
}
