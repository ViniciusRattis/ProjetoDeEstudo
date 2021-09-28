package criandoconta.repository;

import criandoconta.dados.DadosCliente;
import criandoconta.dados.DadosConta;

import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<DadosCliente> clientes;

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
