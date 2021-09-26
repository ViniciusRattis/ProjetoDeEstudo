package CriandoConta;

import java.util.Scanner;

public class ConsultandoContas {

    public void consultarSaldo(AcessoConta[] contas){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero de uma Conta: ");
        AcessoConta contaEncontrada = encontrarConta(contas, scanner.next());

        if (contaEncontrada == null ){
            System.out.println("numero conta não encontrada");
            return;
        }

        System.out.println("Informe os 6 Digitos da Senha: ");
        boolean opcao2 = validarSenha(scanner.next(), contaEncontrada);

        if (opcao2) {
            System.out.println("o Saldo em Conta: " + contaEncontrada.getSaldo());
        } else{
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
