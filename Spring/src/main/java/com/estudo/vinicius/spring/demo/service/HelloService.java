package com.estudo.vinicius.spring.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    private final List<Usuario> usuarios = new ArrayList<>();

    public String mensagemService() {
        return "Qualquer coisa";
    }

    public String adicionarNome(String nome, String senha){
        Usuario usuario = new Usuario(nome, senha);

        if (!validarCaracteres(nome, 4)){
            return "NOME menor que 4 Caracteres";
        }else if(!validarCaracteres(senha, 7)){
            return "SENHA menor que 7 Caracteres";
        }

        if (validarEspacoVazio(nome)){
            return "NOME esta vazio";
        }else if(validarEspacoVazio(senha)){
            return "SENHA esta vazio";
        }

        if(!validarNomeIguais(nome)){
            return "Usuario já cadastrado";
        }

        usuarios.add(usuario);
        return "Sucesso!";

    }
    public List<Usuario> getNomes(){
        return usuarios;
    }

    private boolean validarCaracteres(String nome, int numero) {
        return nome.length() > numero;
    }

    private boolean validarEspacoVazio(String palavra){
        return palavra.equals("");
    }

    private boolean validarNomeIguais(String nome){
        for(Usuario user : usuarios){
            if(nome.equals(user.getNome())){
                return false;
            }
        }
        return true;
    }
}
