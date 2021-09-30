package criandoconta;

import criandoconta.dados.Cliente;
import criandoconta.dados.Conta;
import criandoconta.repository.ContaRepository;
import criandoconta.telas.*;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaRepository contasRepository = new ContaRepository();

        criarDadosFakes(contasRepository);

        new MenuInicial(
                scanner,
                new ConsultarSaldoTela(contasRepository, scanner),
                new CreditarContaTela(contasRepository, scanner),
                new DebitarContaTela(contasRepository, scanner),
                new CadastrarContaTela(contasRepository, scanner)
        ).mostrar(contasRepository);
    }

    public static void criarDadosFakes(ContaRepository contasRepository) {
        Cliente cliente1 = new Cliente("Vinicius","111.111.111-11");
        Cliente cliente2 = new Cliente("Rattis","222.222.222-22");

        Conta conta1 = new Conta(geradorNumeroAleatorio(4),geradorNumeroAleatorio(6),"123456", cliente1);
        Conta conta2 = new Conta(geradorNumeroAleatorio(4),geradorNumeroAleatorio(6),"789101", cliente2);

        contasRepository.add(conta1);
        contasRepository.add(conta2);
    }

    private static String geradorNumeroAleatorio(int quantidadeDeDigitos){
        String digito;

        do{
            digito = String.valueOf(new Random().nextInt((int) Math.pow(10, quantidadeDeDigitos)));
        }while(digito.length() != quantidadeDeDigitos);

        return digito;
    }
}

