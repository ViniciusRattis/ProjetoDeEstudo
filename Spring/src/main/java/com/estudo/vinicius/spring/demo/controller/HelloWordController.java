package com.estudo.vinicius.spring.demo.controller;

import com.estudo.vinicius.spring.demo.service.HelloService;
import com.estudo.vinicius.spring.demo.service.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWordController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String mensagem(){
        return helloService.mensagemService();
    }

    @GetMapping("/nomes")
    public String adicionarNome(@RequestParam(name = "Usuario") String nome,
                                @RequestParam(name = "Senha", required = false) String senha){
        System.out.println("Adicionar Nome: " + nome +
                            "Senha: " + senha);
        return helloService.adicionarNome(nome, senha);
    }

    @GetMapping("/listar")
    public List<Usuario> listarNomes(){
        return helloService.getNomes();
    }
}
