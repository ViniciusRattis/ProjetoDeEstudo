package CriandoConta;

import java.util.Scanner;

public class ConsultandoSaldo {

    public void consultarSaldo(AcessoConta[] contas) {
        Scanner scanner = new Scanner(System.in);
        AcessoConta conta;

        conta = new ValidandoInformacaoNasContas().consultarConta(contas);
        new ValidandoInformacaoNasContas().consultarSenha(conta);

        System.out.println("Saldo em Conta: " + conta.getSaldo());

    }
}
