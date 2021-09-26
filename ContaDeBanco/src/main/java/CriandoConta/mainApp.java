package CriandoConta;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {

        AcessoConta[] contas = new AcessoConta[2];
        GerandoNumeroAleatorio geradorNumero = new GerandoNumeroAleatorio();
        Scanner scanner = new Scanner(System.in);

        // Cadastrando 2 Contas
        contas[0] = new AcessoConta("123456",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),

                "Vinicius",
                "111.111.111-11");
        contas[1] = new AcessoConta("789101",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),
                "Tulio",
                "222.222.222-22");


        System.out.println(StringUtils.isNumeric(contas[0].getSenha()));


        // nome
        // cpf
        // senha
        // agencia = Random
        // contas = Random
        // saldo = 0

        System.out.println(contas[0]);
        System.out.println();
        System.out.println(contas[1]);

        direcionadoOpcaoMenuInicial(scanner, contas);

    }

    private static void direcionadoOpcaoMenuInicial(Scanner scanner, AcessoConta[] contas) {
        switch (menuInicial(scanner)){
            case 1: // Cadastrar Conta
                System.out.println("opcao 1");
                break;
            case 2: // Consultar Saldo
                new ConsultandoContas().consultarSaldo(contas);
                break;
            case 3: // Adicionando valor em uma Conta escolhida
                new CreditandoEmContaEscolhida().adicionarValorEmConta(contas);
                break;
            case 4: // Retirando valor em uma Conta escolhida
                System.out.println("opcao 4");
                break;
            case 5: // Sair
                break;
        }
    }

    private static int menuInicial(Scanner scanner) {
        System.out.println("\n1   -   Cadastrar Conta");
        System.out.println("2   -   Consultar ser saldo em Conta");
        System.out.println("3   -   Creditar em Conta");
        System.out.println("4   -   Debitar em Conta");
        System.out.println("5   -   Sair");
        System.out.print("Digite umas das opções: ");
        return scanner.nextInt();
    }
}

