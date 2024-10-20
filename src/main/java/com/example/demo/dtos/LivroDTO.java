package com.example.demo.dtos;

import com.example.demo.Livro;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LivroDTO {

    private long id;

    @NotNull(message = "O campo titulo não pode ser nulo")
    @NotBlank(message = "O campo titulo não pode ser vazio")
    private String titulo;

    @NotNull(message = "O campo isbn não pode ser nulo")
    @NotBlank(message = "O campo isbn não pode ser vazio")
    private String isbn;

    @NotNull(message = "O campo número de páginas não pode ser nulo")
    private Integer numeroPaginas;

    @NotNull(message = "O campo data da compra não pode ser nulo")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCompra;

    @NotNull(message = "O campo valor de compra não pode ser nulo")
    @Digits(integer=10, fraction=2)
    private BigDecimal valorCompra;

    @NotNull(message = "O campo codigoBarra não pode ser nulo")
    @NotBlank(message = "O campo codigoBarra não pode ser vazio")
    private String codigoBarra;

    private Integer autor;
    private Integer editora;

    private Integer status;
    private Integer conservacao;

    public LivroDTO(){}

    public LivroDTO(Livro livro) {
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.isbn = livro.getIsbn();
        this.numeroPaginas = livro.getNumeroPaginas();
        this.dataCompra = livro.getDataCompra();
        this.valorCompra = livro.getValorCompra();
        this.autor = livro.getAutor().getId();
        this.editora = livro.getEditora().getId();
        this.status = livro.getStatus().getId();
        this.conservacao = livro.getConservacao().getId();
        this.codigoBarra = livro.getCodigoBarra();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo titulo não pode ser nulo") @NotBlank(message = "O campo titulo não pode ser vazio") String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NotNull(message = "O campo titulo não pode ser nulo") @NotBlank(message = "O campo titulo não pode ser vazio") String titulo) {
        this.titulo = titulo;
    }

    public @NotNull(message = "O campo isbn não pode ser nulo") @NotBlank(message = "O campo isbn não pode ser vazio") String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NotNull(message = "O campo isbn não pode ser nulo") @NotBlank(message = "O campo isbn não pode ser vazio") String isbn) {
        this.isbn = isbn;
    }

    public @NotNull(message = "O campo número de páginas não pode ser nulo") Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(@NotNull(message = "O campo número de páginas não pode ser nulo") Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public @NotNull(message = "O campo data da compra não pode ser nulo") LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(@NotNull(message = "O campo data da compra não pode ser nulo") LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public @NotNull(message = "O campo valor de compra não pode ser nulo") @Digits(integer = 10, fraction = 2) BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(@NotNull(message = "O campo valor de compra não pode ser nulo") @Digits(integer = 10, fraction = 2) BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public @NotNull(message = "O campo codigoBarra não pode ser nulo") @NotBlank(message = "O campo codigoBarra não pode ser vazio") String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(@NotNull(message = "O campo codigoBarra não pode ser nulo") @NotBlank(message = "O campo codigoBarra não pode ser vazio") String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public Integer getAutor() {
        return autor;
    }

    public void setAutor(Integer autor) {
        this.autor = autor;
    }

    public Integer getEditora() {
        return editora;
    }

    public void setEditora(Integer editora) {
        this.editora = editora;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getConservacao() {
        return conservacao;
    }

    public void setConservacao(Integer conservacao) {
        this.conservacao = conservacao;
    }
}
