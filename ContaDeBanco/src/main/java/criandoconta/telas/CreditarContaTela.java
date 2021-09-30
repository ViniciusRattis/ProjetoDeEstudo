package criandoconta.telas;

import criandoconta.dados.Conta;
import criandoconta.repository.ContaRepository;
import java.util.Scanner;

public class CreditarContaTela {
    private final ContaRepository contaRepository;
    private final Scanner scanner;

    public CreditarContaTela(ContaRepository contaRepository, Scanner scanner) {
        this.contaRepository = contaRepository;
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println("Informe um numero de uma Conta: ");
        String numeroDeConta = scanner.next();
        Conta contaEncontrada = contaRepository.find(numeroDeConta);
        if (contaEncontrada == null) {
            System.out.println("numero conta não encontrada");
            return;
        }

        System.out.println("Informe um Valor para Creditar na Conta: ");
        double valorCreditar = scanner.nextInt();

        contaEncontrada.setSaldo(contaEncontrada.getSaldo() + valorCreditar);
        System.out.println("Conta Creditada");
    }
}
