package com.sparta.todo.dto.comment.response;

import lombok.Getter;

@Getter
public class CommentGetResponseDto {
    private final Long id;
    private final String comment;

    public CommentGetResponseDto(Long id, String comment) {
        this.id = id;
        this.comment = comment;
    }
}
