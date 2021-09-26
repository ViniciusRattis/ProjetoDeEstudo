package CriandoConta;

public class CadastrandoConta {

    private DadosCliente cotas;


    public DadosCliente cadastroConta(DadosConta[] contas) {

        GerandoNumeroAleatorio geradorNumero = new GerandoNumeroAleatorio();

        // Cadastrando 2 Contas
        contas[0] = new DadosConta("123456",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),

                "Vinicius",
                "111.111.111-11");
        contas[1] = new DadosConta("789101",
                geradorNumero.gerador4Digitos(),
                geradorNumero.gerador6Digitos(),
                "Tulio",
                "222.222.222-22");

        System.out.println(contas[0]);
        System.out.println();
        System.out.println(contas[1]);

        // nome
        // cpf
        // senha
        // agencia = Random
        // contas = Random
        // saldo = 0

        return cotas;
    }

}
