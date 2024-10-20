package com.example.demo;


import com.example.enums.Conservacao;
import com.example.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.Objects;

@Entity
@Table(name="livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_livro")
    private long  id;

    @NotNull @NotBlank
    private String titulo;

    @NotNull @NotBlank
    private String isbn;

    @NotNull
    private Integer numeroPaginas;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCompra;

    @NotNull
    @Digits(integer=10, fraction=2)
    private BigDecimal valorCompra;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name="status")
    private Status status;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name="conservacao")
    private Conservacao conservacao;

    @ManyToOne
    @JoinColumn(name = "Autor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "Editora")
    private Editora editora;

    @NotNull @NotBlank
    private String codigoBarra;

    public Livro() {}

    public Livro(long id, String titulo, String isbn, Integer numeroPaginas, LocalDate dataCompra, BigDecimal valorCompra, Status status, Conservacao conservacao, Autor autor, Editora editora, String codigoBarra) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.status = status;
        this.conservacao = conservacao;
        this.autor = autor;
        this.editora = editora;
        this.codigoBarra = codigoBarra;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull @NotBlank String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NotNull @NotBlank String titulo) {
        this.titulo = titulo;
    }

    public @NotNull @NotBlank String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NotNull @NotBlank String isbn) {
        this.isbn = isbn;
    }

    public @NotNull Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(@NotNull Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public @NotNull LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(@NotNull LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public @NotNull @Digits(integer = 10, fraction = 2) BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(@NotNull @Digits(integer = 10, fraction = 2) BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Conservacao getConservacao() {
        return conservacao;
    }

    public void setConservacao(Conservacao conservacao) {
        this.conservacao = conservacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public @NotNull @NotBlank String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(@NotNull @NotBlank String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id) && Objects.equals(titulo, livro.titulo) && Objects.equals(isbn, livro.isbn) && Objects.equals(numeroPaginas, livro.numeroPaginas) && Objects.equals(dataCompra, livro.dataCompra) && Objects.equals(valorCompra, livro.valorCompra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, isbn, numeroPaginas, dataCompra, valorCompra);
    }


}
