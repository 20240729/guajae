package com.sparta.todo.service;

import com.sparta.todo.dto.*;
import com.sparta.todo.entity.Comment;
import com.sparta.todo.entity.Todo;
import com.sparta.todo.repository.CommentRepository;
import com.sparta.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final CommentRepository commentRepository;

    // 새 일정 저장
    @Transactional
    public TodoSaveResponseDto saveTodo(TodoSaveRequestDto todoSaveRequestDto){
        Todo newtodo = new Todo(
                todoSaveRequestDto.getTitle(),todoSaveRequestDto.getUsername(),todoSaveRequestDto.getContent(),todoSaveRequestDto.getPassword()
        );
        Todo savedTodo = todoRepository.save(newtodo);
        return new TodoSaveResponseDto(savedTodo.getTitle(),savedTodo.getUsername(),savedTodo.getContent(),savedTodo.getPassword());
    }

    // 특정 일정 id 기준으로 찾기
    public TodoGetResponseDto getTodo(Long todoId){
        Todo todo = todoRepository.findById(todoId).orElseThrow(
                ()-> new NullPointerException("없는 일정 번호입니다."));

        return new TodoGetResponseDto(
                todo.getId(),todo.getTitle(),todo.getContent(),todo.getUsername()
        );
    }

    // 특정 일정을 id 기준으로 특정하고 그 일정을 수정하기
    @Transactional
    public TodoUpdateResponseDto updateTodo(Long todoId, TodoUpdateRequestDto todoUpdateRequestDto){
        Todo todo = todoRepository.findById(todoId).orElseThrow(
                ()-> new NullPointerException("없는 일정 번호입니다."));

        todo.update(todoUpdateRequestDto.getUsername(),todoUpdateRequestDto.getTitle(),todoUpdateRequestDto.getContent());

        return new TodoUpdateResponseDto(
                todo.getUsername(),todo.getTitle(),todo.getContent()
        );
    }

    // 댓글 저장
    @Transactional
    public CommentSaveResponseDto saveComment(CommentSaveRequestDto commentSaveRequestDto){
        Comment newcomment = new Comment(
                commentSaveRequestDto.getContent(), commentSaveRequestDto.getUserId()
        );
        Comment savedComment = commentRepository.save(newcomment);
        return new CommentSaveResponseDto(savedComment.getContent(),savedComment.getUserId());
    }

    // 댓글 단건 조회

    // 댓글 전체 조회

    // 댓글 수정

    // 댓글 삭제







}
