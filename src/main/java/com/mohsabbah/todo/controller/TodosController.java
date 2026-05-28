package com.mohsabbah.todo.controller;

import org.springframework.ui.Model;
import com.mohsabbah.todo.model.Todo;
import com.mohsabbah.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodosController {

    private final TodoService todoServices;

    public TodosController(TodoService todoService) {
        this.todoServices = todoService;
    }

    @GetMapping
    public String getTodo(Model model){
        List<Todo> todos = todoServices.getTodos();
        model.addAttribute("todos", todos);
        return "todos";
    }

    @PostMapping("/add/todo")
    public String addTodo(@RequestParam String title){
        todoServices.addTodo(title);
        return "redirect:/todos";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id) {
        todoServices.deleteTodo(id);
        return "redirect:/todos";
    }

    @GetMapping("/complete/{id}")
    public String complete(@PathVariable int id) {
        todoServices.isComplete(id);
        return "redirect:/todos";
    }
}
