package criandoconta.repository;

import criandoconta.dados.DadosCliente;

import java.util.ArrayList;

public class ClienteRepository {
    private final ArrayList<DadosCliente> clientes;

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
    }

    public void add(DadosCliente cliente) {
        clientes.add(cliente);
    }

    public DadosCliente find(String cpf) {
        for (DadosCliente cliente: clientes) {
            if (cliente != null && cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

}
