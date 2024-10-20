package com.example.resources;

import com.example.demo.Livro;
import com.example.demo.dtos.LivroDTO;
import com.example.services.LivroService;
import jakarta.persistence.OneToMany;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

    private final LivroService livroService;

    public LivroResource(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<LivroDTO>> findAll(){
        return ResponseEntity.ok().body(livroService.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<LivroDTO> findById(@PathVariable Long id){
        Livro obj = this.livroService.findById(id);
        return ResponseEntity.ok().body(new LivroDTO(obj));
    }

    @GetMapping(value="/isbn/{isbn}")
    public ResponseEntity<LivroDTO> findByIsbn(@PathVariable String isbn){
        Livro obj = this.livroService.findByIsbn(isbn);
        return ResponseEntity.ok().body(new LivroDTO(obj));
    }

}
