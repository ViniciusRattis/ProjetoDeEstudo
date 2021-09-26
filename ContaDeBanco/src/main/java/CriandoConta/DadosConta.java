package CriandoConta;
import lombok.*;


//@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DadosConta extends DadosCliente {

    private String agencia;     // 4 Digitos
    private String conta;       // 6 Digitos
    private String senha;       // 6 Digitos
    private double saldo = 0;

    public DadosConta(String senha, String agencia, String conta, String nome, String cpf) {
        super(nome, cpf);
        this.senha = senha;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Agencia: " + getAgencia()  +
                "\nConta: " + getConta() +
                "\nSenha: " + getSenha() +
                "\nSaldo: " + getSaldo() +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf();
    }



}

