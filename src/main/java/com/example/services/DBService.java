package com.example.services;

import com.example.demo.Autor;
import com.example.demo.Editora;
import com.example.demo.Livro;
import com.example.enums.Conservacao;
import com.example.enums.Status;
import com.example.repositories.AutorRepository;
import com.example.repositories.EditoraRepository;
import com.example.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private LivroRepository livroRepo;
    @Autowired
    private AutorRepository autorRepo;
    @Autowired
    private EditoraRepository editoraRepo;


    public void initDB() {
        Autor autor01 = autorRepo.save(new Autor("531515451", "Miguel de Cervantes"));
        Autor autor02 = autorRepo.save(new Autor("516515127", "Kai Bird"));
        Autor autor03 = autorRepo.save(new Autor("514354874", "Emily Bronte"));

        Editora editora01 = editoraRepo.save(new Editora("08129789000177", "Edições Livre"));
        Editora editora02 = editoraRepo.save(new Editora("09427678000189", "Intrínseca"));
        Editora editora03 = editoraRepo.save(new Editora("01367425000199", "Penguin-Companhia"));

        Livro livro01 = livroRepo.save(new Livro(0, "Dom Quixote", "98851321", 237, LocalDate.of(2024, 9, 10), new BigDecimal("50.00"), Status.NAOLIDO, Conservacao.EXCELENTE, autor01, editora01, "000001"));
        Livro livro02 = livroRepo.save(new Livro(0, "Oppenheimer", "51351511", 371, LocalDate.of(2024, 9, 11), new BigDecimal("100.00"), Status.NAOLIDO, Conservacao.EXCELENTE, autor02, editora02, "000002"));
        Livro livro03 = livroRepo.save(new Livro(0, "O Morro dos Ventos Uivantes", "123511214", 464, LocalDate.of(2024, 9, 12), new BigDecimal("70.00"), Status.NAOLIDO, Conservacao.EXCELENTE, autor03, editora03, "000003"));


    }
}
