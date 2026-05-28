package com.mohsabbah.todo.service;

import com.mohsabbah.todo.model.Todo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TodoService implements UserDetailsService {

    private final List<Todo> todos = new ArrayList<>();
    private int nextId = 1;

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(String title) {
        todos.add(new Todo(nextId++, title, false));
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public void isComplete(int id){
        todos.stream().filter(todo -> todo.getId() == id).findFirst().ifPresent(todo -> todo.setCompleted(true));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
