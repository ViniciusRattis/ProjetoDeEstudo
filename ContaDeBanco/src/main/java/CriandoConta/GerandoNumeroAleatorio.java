package CriandoConta;

import java.util.Random;
import java.lang.Math;

public class GerandoNumeroAleatorio {

    public String gerador4Digitos() {
        int quantidadeDeDigitos = 4;
        return geradorNumeroAleatorio(quantidadeDeDigitos);
    }

    public String gerador6Digitos() {
        int quantidadeDeDigitos = 6;
        return geradorNumeroAleatorio(quantidadeDeDigitos);
    }
    private String geradorNumeroAleatorio(int quantidadeDeDigitos){
        String digito;

        do{
            digito = String.valueOf(new Random().nextInt((int) Math.pow(10, quantidadeDeDigitos)));
        }while(digito.length() != quantidadeDeDigitos);

        return digito;
    }
}
