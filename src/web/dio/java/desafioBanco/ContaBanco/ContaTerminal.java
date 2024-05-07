package web.dio.java.desafioBanco.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner DADOS_BANCARIOS = new Scanner(System.in);
        Scanner DADOS_BANCARIOS_NOME = new Scanner(System.in);

        double SALDO_BANCARIO = 237.48;

        System.out.println("********************************************\n");
        System.out.println("Bem vindo ao Banco Web Dio!!!");
        System.out.println("Para darmos seguimento ao seu atendimento,");
        System.out.println("informe os dados solicitados abaixo:\n");
        System.out.println("********************************************");

        System.out.println("Por favor, ");
        System.out.println("Informe a sua Agência Bancária (com digito): ");
        String agConta = DADOS_BANCARIOS.nextLine(); 
        
        System.out.println("Informe sua Conta Bancária: ");
        int numConta = DADOS_BANCARIOS.nextInt();

        System.out.println("Informe seu nome: ");
        String nomeCliente = DADOS_BANCARIOS_NOME.nextLine();


        System.out.println("Obrigado por informar seus dados!!!");
        System.out.println("Identificamos sua conta!!!");
        System.out.println("********************************************\n");
        System.out.println("Olá " +nomeCliente+ ",obrigado por criar uma conta em nosso banco, sua agência é "+agConta+",conta "+numConta+" e seu saldo R$ "+SALDO_BANCARIO+" já está disponível para saque.\n");
        System.out.println("********************************************");



        DADOS_BANCARIOS.close();
        DADOS_BANCARIOS_NOME.close();
    }
}
