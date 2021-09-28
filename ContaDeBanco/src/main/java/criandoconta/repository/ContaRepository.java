package criandoconta.repository;

import criandoconta.dados.DadosConta;

import java.util.ArrayList;

public class ContaRepository {
    private ArrayList <DadosConta> contas;

    public ContaRepository() {
        this.contas = new ArrayList<>();
    }

    public void add(DadosConta conta) {
        contas.add(conta);
    }

    public DadosConta find(String numeroDaConta) {
        for (DadosConta conta: contas) {
            if (conta != null && conta.getConta().equals(numeroDaConta)) {
                return conta;
            }
        }
        return null;
    }

}
