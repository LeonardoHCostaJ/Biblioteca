package com.example.repositories;

import com.example.demo.Editora;
import com.example.demo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {

    Optional<Editora> findByCnpj(String cnpj);
}
