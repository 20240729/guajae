package com.sparta.todo.controller;

import com.sparta.todo.dto.comment.request.CommentSaveRequestDto;
import com.sparta.todo.dto.comment.response.CommentGetResponseDto;
import com.sparta.todo.dto.comment.response.CommentSaveResponseDto;
import com.sparta.todo.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    // 댓글 저장
    @PostMapping("/api/todos/{todoid}/comments")
    public ResponseEntity<CommentSaveResponseDto> saveComment(
            @PathVariable Long todoid,@RequestBody CommentSaveRequestDto commentSaveRequestDto
    ) {
        return ResponseEntity.ok(commentService.saveComment(todoid, commentSaveRequestDto));
    }

    // 댓글 단건 조회
    @GetMapping("/api/todos/comments/{commentId}")
    public ResponseEntity<CommentGetResponseDto> getComment(
            @PathVariable Long commentId
    ){
        return ResponseEntity.ok(commentService.getComment(commentId));
    }

    // 댓글 전체 조회

    // 댓글 수정

    // 댓글 삭제
}
