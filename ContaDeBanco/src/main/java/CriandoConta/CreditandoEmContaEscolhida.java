package CriandoConta;

import java.util.Scanner;

public class CreditandoEmContaEscolhida {

    public void adicionarValorEmConta(DadosConta[] contas) {
        Scanner scanner = new Scanner(System.in);
        double valorCreditar;

        DadosConta conta = new ValidandoInformacaoNasContas().consultarConta(contas);

        System.out.println("Informe um Valor para Creditar na Conta: ");
        valorCreditar = scanner.nextInt();

        conta.setSaldo(conta.getSaldo() + valorCreditar);
    }
}
