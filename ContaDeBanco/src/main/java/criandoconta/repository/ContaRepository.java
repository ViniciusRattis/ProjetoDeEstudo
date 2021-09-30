package criandoconta.repository;

import criandoconta.dados.Conta;

import java.util.ArrayList;

public class ContaRepository {
    private final ArrayList <Conta> contas;

    public ContaRepository() {
        this.contas = new ArrayList<>();
    }

    public void add(Conta conta) {
        contas.add(conta);
    }

    public Conta find(String numeroDaConta) {
        for (Conta conta: contas) {
            if (conta != null && conta.getConta().equals(numeroDaConta)) {
                return conta;
            }
        }
        return null;
    }
    public void ImprimirTela(){
        contas.forEach(System.out::println);
    }
}
