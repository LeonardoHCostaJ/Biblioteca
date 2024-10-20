package com.example.services;

import com.example.demo.Autor;
import com.example.demo.Livro;
import com.example.demo.dtos.LivroDTO;
import com.example.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LivroService {

    private final LivroRepository livroRepo;

    public LivroService(LivroRepository livroRepo) {
        this.livroRepo = livroRepo;
    }

    public List<LivroDTO> findAll() {
        return livroRepo.findAll().stream()
                .map(LivroDTO::new)
                .collect(Collectors.toList());
    }

    public Livro findById(Long id){
        Optional<Livro> obj = livroRepo.findById(id);
        return obj.orElse(null);
    }

    public Livro findByIsbn(String isbn){
        Optional<Livro> obj = livroRepo.findByIsbn(isbn);
        return obj.orElse(null);
    }
}
