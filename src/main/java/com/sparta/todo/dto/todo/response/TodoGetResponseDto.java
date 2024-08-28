package com.sparta.todo.dto.todo.response;

import com.sparta.todo.entity.Comment;
import lombok.Getter;

import java.util.List;

@Getter
public class TodoGetResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private List<Comment> commentList;

    public TodoGetResponseDto(Long id, String title, String content,List<Comment> commentList) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.commentList = commentList;
    }
}
