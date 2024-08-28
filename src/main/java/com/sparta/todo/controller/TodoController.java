package com.sparta.todo.controller;

import com.sparta.todo.dto.TodoGetResponseDto;
import com.sparta.todo.dto.TodoSaveRequestDto;
import com.sparta.todo.dto.TodoSaveResponseDto;
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




}
