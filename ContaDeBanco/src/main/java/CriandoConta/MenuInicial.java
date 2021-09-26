package CriandoConta;

import java.util.Scanner;

public class MenuInicial {

    public void direcionadoOpcaoMenuInicial(Scanner scanner, DadosConta[] contas) {
        switch (menuInicial(scanner)){
            case 1: // Cadastrar Conta
                System.out.println("opcao 1");
                break;
            case 2: // Consultar Saldo
                new ConsultandoSaldo().consultarSaldo(contas);
                break;
            case 3: // Adicionando valor em uma Conta escolhida
                new CreditandoEmContaEscolhida().adicionarValorEmConta(contas);
                break;
            case 4: // Retirando valor em uma Conta escolhida
                new DebitandoEmContaEscolhida().retirarValorEmConta(contas);
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
