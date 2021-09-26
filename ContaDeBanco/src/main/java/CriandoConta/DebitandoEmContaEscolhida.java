package CriandoConta;

import java.util.Scanner;

public class DebitandoEmContaEscolhida {

    public void retirarValorEmConta(AcessoConta[] contas) {
        Scanner scanner = new Scanner(System.in);
        AcessoConta conta;
        double valorDebita;

        conta = new ValidandoInformacaoNasContas().consultarConta(contas);
        new ValidandoInformacaoNasContas().consultarSenha(conta);

        System.out.println("Informe um Valor para Creditar na Conta: ");
        valorDebita = scanner.nextInt();

        conta.setSaldo(conta.getSaldo() - valorDebita);
    }
}
