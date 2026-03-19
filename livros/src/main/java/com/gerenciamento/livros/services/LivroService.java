package com.gerenciamento.livros.services;

import com.gerenciamento.livros.models.Livro;
import com.gerenciamento.livros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
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

    public Livro save(Livro livro){
        return repository.save(livro);
    }

    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
