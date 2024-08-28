package com.sparta.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Todo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    public Todo(String username, String title, String content, String password) {
        this.title = title;
        this.content = content;
    }

    public void update(String username,String title, String content) {
        this.title = title;
        this.content = content;
    }

}
