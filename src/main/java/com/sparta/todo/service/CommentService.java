package com.sparta.todo.service;

import com.sparta.todo.dto.comment.request.CommentSaveRequestDto;
import com.sparta.todo.dto.comment.response.CommentSaveResponseDto;
import com.sparta.todo.entity.Comment;
import com.sparta.todo.entity.Todo;
import com.sparta.todo.repository.CommentRepository;
import com.sparta.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final TodoRepository todoRepository;

    // 새 댓글 저장
    @Transactional
    public CommentSaveResponseDto saveComment(Long todoId, CommentSaveRequestDto commentSaveRequestDto) {
        Todo todo = todoRepository.findById(todoId).orElseThrow(
                () -> new NullPointerException("댓글을 추가할 일정 번호가 없습니다.")
        );

        Comment newComment = new Comment(commentSaveRequestDto.getComment(),todo);
        Comment savedComment = commentRepository.save(newComment);

        return new CommentSaveResponseDto(savedComment.getId(),savedComment.getComment());
    }

    // 댓글 단건 조회

    // 댓글 전체 조회

    // 댓글 수정

    // 댓글 삭제
}
