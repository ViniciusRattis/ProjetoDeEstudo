* Crie um programa JAVA que contenha as classes Contas e Cliente
* O cliente possui um atributo Conta.
A conta deve ter uma senha numérica de até 6 dígitos.
Esse programa deve possuir um menu onde o usuário possa:
1. Abrir uma Conta (Cadastrar conta)
   * O programa deve pedir as informações do cliente
   * O programa deve gerar um numero randômico para a conta e para o digito da conta
   * O saldo inicial deve ser zero.
2. Consultar Seu Saldo em Conta
   * O cliente deve informar o número da conta
   * O cliente deve informar a senha
   * Se o numero da conta bater com a senha , exibir o saldo , se não informar numero conta ou senha invalida.
3. Creditar em conta
   * O programa deve pedir o numero da conta e valor a ser creditado
   * O programa Deve creditar o valor.
4. Debitar em contar:
   * O programa deve pedir o numero da conta, senha e valor a ser debitado
   * Se o numero da conta bater com a senha , fazer o debito , se não informar numero conta ou senha invalida.
5. Sair


6. Recriar o programa do exercício do dia 22/09/2021 utilizando:

   * Maven 
   * Lombok
   * Lib para verificar se a String contem apenas números

7. Dica:
   * Para utilizar o Maven é necessário criar um Maven Project
   * Para o Lombok funcionar é necessário instalar na sua IDE (IntelliJ)
   * Use Lombok para implementar os Gets e Sets
   * As classes Conta e Cliente deve ter apenas um construtor que receba todos os parâmetros. (NÃO USE Lombok). Develop it
   * A classe da Lib que verifica se a String contém apenas números é StringUtils
   * Nesse exercício o google vai ser muito seu amigo. Para um melhor resultado, faça as pesquisas em inglês caso não ache em português.

8. Exercício de casa:
   * Evoluir o exercício do dia 22/07:
   * Crie o pacote criandoconta.repository
   * Crie as classes ContaRepository e ClienteRepository
   * Crei os metodos add e find em cada respository
   * Use o criandoconta.repository no seu método main
   * Crie a classe poupança
   * Implemente o metodo renderJuros();
   * Adicione no menu a opção de criar uma poupança