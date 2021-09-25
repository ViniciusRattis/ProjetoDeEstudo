package CriandoConta;

public class mainApp {

    public static void main(String[] args) {

        AcessoConta[] contas = new AcessoConta[2];
        GerandoNumeroAleatorio geradorNumero = new GerandoNumeroAleatorio();

        contas[0] = new AcessoConta("123456",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),
                "Vinicius",
                "111.111.111-11"
        );

        contas[1] = new AcessoConta("789101",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),
                "Tulio",
                "222.222.222-22"
        );

        // nome
        // cpf
        // senha
        // agencia = Random
        // contas = Random
        // saldo = 0

        System.out.println(contas[0]);
        System.out.println();
        System.out.println(contas[1]);

        new ConsultandoSaldo().consultarSaldo(contas);

    }
}

