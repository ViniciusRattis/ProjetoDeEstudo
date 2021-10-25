package com.estudo.vinicius.spring.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    private List<Usuario> usuarios = new ArrayList<>();

    public String mensagemService() {
        return "Qualquer coisa";
    }

    public String adicionarNome(String nome, String senha){
        Usuario usuario = new Usuario(nome, senha);
        usuarios.add(usuario);
        return "Sucesso!";
    }

    public List<Usuario> getNomes(){
        return usuarios;
    }

}
