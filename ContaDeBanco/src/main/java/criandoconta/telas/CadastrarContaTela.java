package criandoconta.telas;

import criandoconta.dados.Cliente;
import criandoconta.dados.Conta;
import criandoconta.repository.ContaRepository;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;
import java.util.Scanner;

public class CadastrarContaTela {
    private final ContaRepository contasRepository;
    private final Scanner scanner;

    public CadastrarContaTela (ContaRepository contasRepository, Scanner scanner) {
        this.contasRepository = contasRepository;
        this.scanner = scanner;
    }

    public void mostrar () {
        System.out.println("Informe as seguintes Informações:");

        System.out.print("Digite um NOME: ");
        String nome = scanner.next();

        System.out.print("Digite um CPF: ");
        String cpf = scanner.next(); // 111.111.111-11

        String senha;
        do {
            System.out.print("Digite uma SENHA: ");
            senha = scanner.next();

            if (!StringUtils.isNumeric(senha)){
                System.out.println("Serra Invalida!");
            }

        }while (!StringUtils.isNumeric(senha));

        String agencia = geradorNumeroAleatorio(4);

        String conta = geradorNumeroAleatorio(6);

        Cliente dadoscliente = new Cliente(nome,cpf);
        Conta dadosconta = new Conta(agencia, conta, senha, dadoscliente);


        contasRepository.add(dadosconta);
    }

    private String geradorNumeroAleatorio(int quantidadeDeDigitos){
        String digito;

        do{
            digito = String.valueOf(new Random().nextInt((int) Math.pow(10, quantidadeDeDigitos)));
        }while(digito.length() != quantidadeDeDigitos);

        return digito;
    }
}
