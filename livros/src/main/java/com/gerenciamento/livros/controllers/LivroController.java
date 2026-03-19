package com.gerenciamento.livros.controllers;

import com.gerenciamento.livros.models.Livro;
import com.gerenciamento.livros.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return service.save(livro);
    }

    @GetMapping
    public List<Livro> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
