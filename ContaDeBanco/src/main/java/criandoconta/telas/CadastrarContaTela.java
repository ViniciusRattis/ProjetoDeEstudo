package criandoconta.telas;

import java.util.Random;

public class CadastrarContaTela {

    public void mostrar () {

    }


    private String geradorNumeroAleatorio(int quantidadeDeDigitos){
        String digito;

        do{
            digito = String.valueOf(new Random().nextInt((int) Math.pow(10, quantidadeDeDigitos)));
        }while(digito.length() != quantidadeDeDigitos);

        return digito;
    }

    // Cadastrando 2 Contas
//    contas[0] = new DadosConta("123456",
//                                       "Vinicius",
//                                       "111.111.111-11");
//
//    contas[1] = new DadosConta("789101",
//                                       "Tulio",
//                                       "222.222.222-22");
//
//        System.out.println(contas[0]);
//        System.out.println();
//        System.out.println(contas[1]);

    // nome
    // cpf
    // senha
    // agencia = Random
    // contas = Random
    // saldo = 0

    // validando a senha se tem só numeros
    //System.out.println(StringUtils.isNumeric(contas[0].getSenha()));


}
