package com.estudo.vinicius.spring.demo.service;

public class Usuario {

    public String nome;
    public String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

}
