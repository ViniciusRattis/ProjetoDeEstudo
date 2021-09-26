package CriandoConta;

public class ConsultandoSaldo {

    public void consultarSaldo(DadosConta[] contas) {

        DadosConta conta = new ValidandoInformacaoNasContas().consultarConta(contas);
        new ValidandoInformacaoNasContas().consultarSenha(conta);

        System.out.println("Saldo em Conta: " + conta.getSaldo());

    }
}
