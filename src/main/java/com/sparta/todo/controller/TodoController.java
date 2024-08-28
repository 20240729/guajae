package com.sparta.todo.controller;

import com.sparta.todo.dto.todo.request.TodoSaveRequestDto;
import com.sparta.todo.dto.todo.request.TodoUpdateRequestDto;
import com.sparta.todo.dto.todo.response.TodoGetResponseDto;
import com.sparta.todo.dto.todo.response.TodoSaveResponseDto;
import com.sparta.todo.dto.todo.response.TodoUpdateResponseDto;
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




}
