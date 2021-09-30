package criandoconta.telas;

import criandoconta.dados.Conta;
import criandoconta.repository.ContaRepository;
import java.util.Scanner;

public class DebitarContaTela {
    private final ContaRepository contaRepository;
    private final Scanner scanner;

    public DebitarContaTela (ContaRepository contaRepository, Scanner scanner) {
        this.contaRepository = contaRepository;
        this.scanner = scanner;
    }

    public void mostrar () {
        System.out.println("Informe um numero de uma Conta: ");
        String numeroDeConta = scanner.next();
        Conta contaEncontrada = contaRepository.find(numeroDeConta);

        if (contaEncontrada == null) {
            System.out.println("numero conta não encontrada");
            return;
        }

        System.out.println("Informe os 6 Digitos da Senha: ");
        String senhaDigitada = scanner.next();

        if (! validarSenha(senhaDigitada, contaEncontrada)) {
            System.out.println("senha invalida.");
            return;
        }

        System.out.println("Informe um Valor para Creditar na Conta: ");
        double valorDebita = scanner.nextInt();

        contaEncontrada.setSaldo(contaEncontrada.getSaldo() - valorDebita);
    }

    private boolean validarSenha(String consultaSenha, Conta contaEncontrada) {
        return consultaSenha.equals(contaEncontrada.getSenha());
    }
}
