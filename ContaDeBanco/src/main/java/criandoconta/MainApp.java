package criandoconta;

import criandoconta.dados.DadosCliente;
import criandoconta.dados.DadosConta;
import criandoconta.repository.ClienteRepository;
import criandoconta.repository.ContaRepository;
import criandoconta.telas.*;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaRepository contasRepository = new ContaRepository();
        ClienteRepository clienteRepository = new ClienteRepository();

        criarDadosFakes(clienteRepository, contasRepository);

        new MenuInicial(
                scanner,
                new ConsultarSaldoTela(contasRepository, scanner),
                new CreditarContaTela(contasRepository, scanner),
                new DebitarContaTela(contasRepository, scanner),
                new CadastrarContaTela()
        ).mostrar();
    }

    public static void criarDadosFakes(ClienteRepository clienteRepository, ContaRepository contasRepository) {
        DadosCliente cliente1 = new DadosCliente("Vinicius","111.111.111-11");
        DadosCliente cliente2 = new DadosCliente("Tulio","222.222.222-22");
        clienteRepository.add(cliente1);
        clienteRepository.add(cliente2);

        contasRepository.add(new DadosConta(
                geradorNumeroAleatorio(4),
                geradorNumeroAleatorio(6),
                "123456", 0, cliente1));

        contasRepository.add(new DadosConta(
                geradorNumeroAleatorio(4),
                geradorNumeroAleatorio(6),
                "789101", 0, cliente2));
    }

    private static String geradorNumeroAleatorio(int quantidadeDeDigitos){
        String digito;

        do{
            digito = String.valueOf(new Random().nextInt((int) Math.pow(10, quantidadeDeDigitos)));
        }while(digito.length() != quantidadeDeDigitos);

        return digito;
    }
}

