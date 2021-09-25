package CriandoConta;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor

public class DadosCliente {

    private String nome;
    private String cpf;

    public DadosCliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
