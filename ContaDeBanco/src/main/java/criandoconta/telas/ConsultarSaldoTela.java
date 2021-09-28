package criandoconta.telas;

import criandoconta.dados.DadosConta;
import criandoconta.repository.ContaRepository;

import java.util.Scanner;

public class ConsultarSaldoTela {
    private final ContaRepository contaRepository;
    private final Scanner scanner;

    public ConsultarSaldoTela (ContaRepository contaRepository, Scanner scanner) {
        this.contaRepository = contaRepository;
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println("Informe um numero de uma Conta: ");
        String numeroDeConta = scanner.next();
        DadosConta contaEncontrada = contaRepository.find(numeroDeConta);

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

        System.out.println("Saldo em Conta: " + contaEncontrada.getSaldo());
    }

    private boolean validarSenha(String consultaSenha, DadosConta contaEncontrada) {
        return consultaSenha.equals(contaEncontrada.getSenha());
    }
}
