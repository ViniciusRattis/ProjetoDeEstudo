package criandoconta.dados;

import lombok.*;


//@Data
@Setter
@Getter
@NoArgsConstructor
public class DadosConta {
    private String agencia;     // 4 Digitos
    private String conta;       // 6 Digitos
    private String senha;       // 6 Digitos
    private double saldo;
    private DadosCliente cliente;

    public DadosConta(String agencia, String conta, String senha, DadosCliente cliente) {
        this.agencia = agencia;
        this.conta = conta;
        this.senha = senha;
        this.saldo = 0; // ao abrir a conta o saldo tem que ser 0.
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Agencia: " + getAgencia()  +
                "\nConta: " + getConta() +
                "\nSenha: " + getSenha() +
                "\nSaldo: " + getSaldo();
    }
}

