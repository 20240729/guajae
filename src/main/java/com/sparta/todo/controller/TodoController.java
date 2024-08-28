package com.sparta.todo.controller;

import com.sparta.todo.dto.*;
import com.sparta.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    // 일정 저장
    @PostMapping("/api/todos")
    public ResponseEntity<TodoSaveResponseDto> saveTodo(
            @RequestBody TodoSaveRequestDto todoSaveRequestDto
    ) {
        return ResponseEntity.ok(
                todoService.saveTodo(todoSaveRequestDto)
        );
    }

    // 단건 조회
    @GetMapping("/api/todos/{todoId}")
    public ResponseEntity<TodoGetResponseDto> getTodo(
            @PathVariable Long todoId
    ){
        return ResponseEntity.ok(todoService.getTodo(todoId));
    }

    // 수정
    @PutMapping("/api/todos/{todoId}")
    public ResponseEntity<TodoUpdateResponseDto> updateTodo(
            @PathVariable Long todoId, @RequestBody TodoUpdateRequestDto todoUpdateRequestDto
    ){
        return ResponseEntity.ok(todoService.updateTodo(todoId, todoUpdateRequestDto));
    }

    // 댓글 저장
    public ResponseEntity<CommentSaveResponseDto> saveComment(
            @RequestBody CommentSaveRequestDto commentSaveRequestDto
    ){
        return ResponseEntity.ok(todoService.saveComment(commentSaveRequestDto));
    }

    // 댓글 단건 조회

    // 댓글 전체 조회

    // 댓글 수정

    // 댓글 삭제




}
