package com.example.demo.dtos;

import com.example.demo.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AutorDTO {

    private Integer id;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String nome;

    @NotNull(message = "O campo documento não pode ser nulo")
    @NotBlank(message = "O campo documento não pode ser vazio")
    private String documentoPessoal;

    public void AutorDTO() {
    }

    public AutorDTO(Autor Autor) {
        this.id = Autor.getId();
        this.nome = Autor.getNome();
        this.documentoPessoal = Autor.getDocumentoPessoal();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome não pode ser nulo") @NotBlank(message = "O campo nome não pode ser vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser nulo") @NotBlank(message = "O campo nome não pode ser vazio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo documento não pode ser nulo") @NotBlank(message = "O campo documento não pode ser vazio") String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(@NotNull(message = "O campo documento não pode ser nulo") @NotBlank(message = "O campo documento não pode ser vazio") String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }
}
