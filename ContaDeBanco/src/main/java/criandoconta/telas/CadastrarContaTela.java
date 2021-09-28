package criandoconta.telas;

import criandoconta.dados.DadosCliente;
import criandoconta.dados.DadosConta;
import criandoconta.repository.ClienteRepository;
import criandoconta.repository.ContaRepository;

import java.util.Random;
import java.util.Scanner;

public class CadastrarContaTela {
    private final ContaRepository contasRepository;
    private final ClienteRepository clienteRepository;
    private final Scanner scanner;

    public CadastrarContaTela (ContaRepository contasRepository, ClienteRepository clienteRepository, Scanner scanner) {
        this.contasRepository = contasRepository;
        this.clienteRepository = clienteRepository;
        this.scanner = scanner;
    }


    public void mostrar () {
        System.out.println("Informe as seguintes Informações:");

        System.out.print("Digite um NOME: ");
        String nome = scanner.next();

        System.out.print("Digite um CPF: ");
        String cpf = scanner.next(); // 111.111.111-11

        System.out.print("Digite uma SENHA: ");
        String senha = scanner.next();

        String agencia = geradorNumeroAleatorio(4);

        String conta = geradorNumeroAleatorio(6);

        DadosCliente dadoscliente = new DadosCliente(nome,cpf);
        DadosConta dadosconta = new DadosConta(agencia, conta, senha, dadoscliente);

        clienteRepository.add(dadoscliente);
        contasRepository.add(dadosconta);
    }

    private String geradorNumeroAleatorio(int quantidadeDeDigitos){
        String digito;

        do{
            digito = String.valueOf(new Random().nextInt((int) Math.pow(10, quantidadeDeDigitos)));
        }while(digito.length() != quantidadeDeDigitos);

        return digito;
    }

    // validando a senha se tem só numeros
    //System.out.println(StringUtils.isNumeric(contas[0].getSenha()));
}
