package CriandoConta;

import java.util.Scanner;

public class CreditandoEmContaEscolhida {

    public void adicionarValorEmConta(AcessoConta[] contas) {
        Scanner scanner = new Scanner(System.in);
        AcessoConta conta;
        double valorCreditar;

        conta = new ValidandoInformacaoNasContas().consultarConta(contas);

        System.out.println("Informe um Valor para Creditar na Conta: ");
        valorCreditar = scanner.nextInt();

        conta.setSaldo(conta.getSaldo() + valorCreditar);
    }
}
