package CriandoConta;

public class mainApp {

    public static void main(String[] args) {

        AcessoConta[] conta = new AcessoConta[2];
        GerandoNumeroAleatorio geradorNumero = new GerandoNumeroAleatorio();

        conta[0] = new AcessoConta("123456",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),
                "Vinicius",
                "111.111.111-11"
        );

        conta[1] = new AcessoConta("789101",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),
                "Tulio",
                "222.222.222-22"
        );

        // nome
        // cpf
        // senha
        // agencia = Random
        // conta = Random
        // saldo = 0

        System.out.println(conta[0]);
        System.out.println();
        System.out.println(conta[0]);



        System.out.println(conta[0].getSaldo());

    }
}

