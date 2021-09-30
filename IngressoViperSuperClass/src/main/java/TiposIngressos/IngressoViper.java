package TiposIngressos;

public class IngressoViper extends Ingresso {
    private final float valorAdicional;

    public IngressoViper(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor do Ingresso Viper: " + (getValor() + getValorAdicional());
    }

    public float getValorAdicional() {
        return valorAdicional;
    }
}
