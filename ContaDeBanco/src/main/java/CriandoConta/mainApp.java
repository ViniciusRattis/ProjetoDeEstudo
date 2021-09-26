package CriandoConta;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {
        int QuantidadeDeContaCadastrada = 10;
        DadosConta[] contas = new DadosConta[QuantidadeDeContaCadastrada];

        Scanner scanner = new Scanner(System.in);

        new CadastrandoConta().cadastroConta(contas);

        new MenuInicial().direcionadoOpcaoMenuInicial(scanner, contas);

        // validando a senha se tem só numeros
        System.out.println(StringUtils.isNumeric(contas[0].getSenha()));

    }
}

