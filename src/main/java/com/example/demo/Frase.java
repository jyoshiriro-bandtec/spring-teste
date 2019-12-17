package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Frase
 */
@Entity
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String conteudo;

    private String autor;

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
}