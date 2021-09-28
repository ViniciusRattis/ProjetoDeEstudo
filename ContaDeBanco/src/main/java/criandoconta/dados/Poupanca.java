package criandoconta.dados;

import criandoconta.dados.DadosConta;

public class Poupanca extends DadosConta {

    public void renderJuros() {
        double saldo = getSaldo();
        setSaldo(saldo *= 1.005 + 5);
    }
}
