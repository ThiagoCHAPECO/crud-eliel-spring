package com.gerenciamento.livros.services;

import com.gerenciamento.livros.models.Livro;
import com.gerenciamento.livros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/livros")
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public List<Livro> findAll(){
        return repository.findAll();
    }

    public Livro findById(Long id){
        Optional<Livro> obj = repository.findById(id);
        return obj.get();
    }
}
