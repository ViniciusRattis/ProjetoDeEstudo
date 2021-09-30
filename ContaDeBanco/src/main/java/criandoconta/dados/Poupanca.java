package criandoconta.dados;

public class Poupanca extends Conta {

    public void renderJuros() {
        double saldo = getSaldo();
        setSaldo(saldo *= 1.005);
    }
}
