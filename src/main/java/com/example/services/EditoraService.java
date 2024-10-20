package com.example.services;

import com.example.demo.Autor;
import com.example.demo.Editora;
import com.example.demo.Livro;
import com.example.demo.dtos.EditoraDTO;
import com.example.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepo;

    public List<EditoraDTO> findAll() {
        return editoraRepo.findAll().stream()
                .map(obj -> new EditoraDTO(obj))
                .collect(Collectors.toList());
    }

    public Editora findbyId(Integer id){
        Optional<Editora> obj = editoraRepo.findById(id);
        return obj.orElse(null);
    }

    public Editora findByCnpj(String cnpj){
        Optional<Editora> obj = editoraRepo.findByCnpj(cnpj);
        return obj.orElse(null);
    }
}
