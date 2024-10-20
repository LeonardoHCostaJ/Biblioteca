package com.example.services;

import com.example.demo.Autor;
import com.example.demo.dtos.AutorDTO;
import com.example.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepo;

    public List<AutorDTO> findAll() {
        return autorRepo.findAll().stream()
                .map(obj -> new AutorDTO(obj))
                .collect(Collectors.toList());
    }

    public Autor findbyId(Integer id){
        Optional<Autor> obj = autorRepo.findById(id);
        return obj.orElse(null);
    }
}
