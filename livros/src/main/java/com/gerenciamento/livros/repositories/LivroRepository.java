package com.gerenciamento.livros.repositories;

import com.gerenciamento.livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
