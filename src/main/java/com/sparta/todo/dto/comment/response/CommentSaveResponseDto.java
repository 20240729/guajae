package com.sparta.todo.dto.comment.response;

import lombok.Getter;

@Getter
public class CommentSaveResponseDto {
    private final Long id;
    private final String comment;

    public CommentSaveResponseDto(Long id, String comment) {
        this.comment = comment;
        this.id = id;
    }
}
