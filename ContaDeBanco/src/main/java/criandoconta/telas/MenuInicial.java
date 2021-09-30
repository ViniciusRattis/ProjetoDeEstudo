package criandoconta.telas;

import criandoconta.repository.ContaRepository;

import java.util.Scanner;

public class MenuInicial {
    Scanner scanner;
    private final ConsultarSaldoTela consultarSaldoTela;
    private final CreditarContaTela creditarContaTela;
    private final DebitarContaTela debitarContaTela;
    private final CadastrarContaTela cadastrarContaTela;

    public MenuInicial (
            Scanner scanner,
            ConsultarSaldoTela consultarSaldoTela,
            CreditarContaTela creditarContaTela,
            DebitarContaTela debitarContaTela,
            CadastrarContaTela cadastrarContaTela) {
        this.scanner = scanner;
        this.consultarSaldoTela = consultarSaldoTela;
        this.creditarContaTela = creditarContaTela;
        this.debitarContaTela = debitarContaTela;
        this.cadastrarContaTela = cadastrarContaTela;
    }
   
    public void mostrar(ContaRepository contasRepository) {
        int escolheOpcao;

        do {
            mostrarMenuInicial();

            System.out.print("Digite umas das opções: ");
            escolheOpcao = scanner.nextInt();
            System.out.println();
            switch (escolheOpcao){
                case 1: // Cadastrar Conta
                    cadastrarContaTela.mostrar();
                    break;
                case 2: // Consultar Saldo
                    consultarSaldoTela.mostrar();
                    break;
                case 3: // Adicionando valor em uma Conta escolhida
                    creditarContaTela.mostrar();
                    break;
                case 4: // Retirando valor em uma Conta escolhida
                    debitarContaTela.mostrar();
                    break;
                case 5: // Sair
                    break;
                case 6: // Imprimir
                    contasRepository.ImprimirTela();
                    break;
            }
        }while (escolheOpcao != 5);
    }

    private void mostrarMenuInicial() {
        System.out.println("\n1   -   Cadastrar Conta");
        System.out.println("2   -   Consultar ser saldo em Conta");
        System.out.println("3   -   Creditar em Conta");
        System.out.println("4   -   Debitar em Conta");
        System.out.println("5   -   Sair");
        System.out.print("Digite umas das opções: ");
    }
}
