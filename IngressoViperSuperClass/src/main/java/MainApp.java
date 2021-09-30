import TiposIngressos.Ingresso;
import TiposIngressos.IngressoViper;

public class MainApp {

    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(100);
        IngressoViper ingressoViper = new IngressoViper(100, 50);

        System.out.println(ingresso);
        System.out.println(ingressoViper);
    }
}
