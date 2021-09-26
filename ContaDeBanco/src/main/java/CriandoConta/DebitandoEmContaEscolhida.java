package CriandoConta;

import java.util.Scanner;

public class DebitandoEmContaEscolhida {

    public void retirarValorEmConta(DadosConta[] contas) {
        Scanner scanner = new Scanner(System.in);
        double valorDebita;

        DadosConta conta = new ValidandoInformacaoNasContas().consultarConta(contas);
        new ValidandoInformacaoNasContas().consultarSenha(conta);

        System.out.println("Informe um Valor para Creditar na Conta: ");
        valorDebita = scanner.nextInt();

        conta.setSaldo(conta.getSaldo() - valorDebita);
    }
}
