package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FrasesController
 */
@RestController
public class FrasesController {

    @Autowired
    private FraseRepository repository;

    @GetMapping("/")
    public List getFrases() {
        return repository.findAll();
    }

    @GetMapping("/cria")
    public void cria() {
        Frase f = new Frase();
        f.setAutor("autor "+repository.count()+1);
        f.setConteudo("conteudo "+repository.count()+1);
        repository.save(f);
    }
    
}