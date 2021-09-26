package CriandoConta;

import java.util.Scanner;

public class ValidandoInformacaoNasContas {
    Scanner scanner = new Scanner(System.in);

    public DadosConta consultarConta(DadosConta[] contas) {
        System.out.println("Informe um numero de uma Conta: ");
        DadosConta contaEncontrada = encontrarConta(contas, scanner.next());

        if (contaEncontrada == null) {
            System.out.println("numero conta não encontrada");
            return null;
        }
        return contaEncontrada;
    }

    public void consultarSenha(DadosConta conta){

        System.out.println("Informe os 6 Digitos da Senha: ");

        if (! validarSenha(scanner.next(), conta)) {
            System.out.println("senha invalida.");
        }
    }

    private boolean validarSenha(String consultaSenha, DadosConta contaEncontrada) {
        return consultaSenha.equals(contaEncontrada.getSenha());
    }

    private DadosConta encontrarConta(DadosConta[] contas, String consultaNumeroConta) {
        for (DadosConta conta : contas) {
            if (consultaNumeroConta.equals(conta.getConta())) {
                return conta;
            }
        }
        return null;
    }

}
