package CriandoConta;

import java.util.Scanner;

public class ValidandoInformacaoNasContas {
    Scanner scanner = new Scanner(System.in);

    public AcessoConta consultarConta(AcessoConta[] contas) {
        System.out.println("Informe um numero de uma Conta: ");
        AcessoConta contaEncontrada = encontrarConta(contas, scanner.next());

        if (contaEncontrada == null) {
            System.out.println("numero conta não encontrada");
            return null;
        }
        return contaEncontrada;
    }

    public void consultarSenha(AcessoConta conta){

        System.out.println("Informe os 6 Digitos da Senha: ");

        if (! validarSenha(scanner.next(), conta)) {
            System.out.println("senha invalida.");
        }
    }

    private boolean validarSenha(String consultaSenha, AcessoConta contaEncontrada) {
        return consultaSenha.equals(contaEncontrada.getSenha());
    }

    private AcessoConta encontrarConta(AcessoConta[] contas,String consultaNumeroConta) {
        for (AcessoConta conta : contas) {
            if (consultaNumeroConta.equals(conta.getConta())) {
                return conta;
            }
        }
        return null;
    }

}
