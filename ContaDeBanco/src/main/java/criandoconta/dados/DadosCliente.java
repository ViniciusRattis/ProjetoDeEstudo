package criandoconta.dados;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class DadosCliente {
    private String nome;
    private String cpf;
    private DadosConta conta;

    public DadosCliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = null;
    }
}
