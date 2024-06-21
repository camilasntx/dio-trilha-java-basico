package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int numero; 
        String agencia; 
        String nomeCliente;
        double saldo;

        System.out.println("-----Conta Bancária-----");
        System.out.println();
        System.out.println("Por favor, digite o número da sua Conta: (1234)");
        numero = sc.nextInt();

        System.out.println("Agora, por favor, digite o número da sua Agência: (012-3)");
        agencia = sc.next();

        System.out.println("Me informe o seu nome:");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Agora, me informe o seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta"
        + "nosso banco, sua agência é %s, "
        + "sua conta é %d e seu saldo é de %.2f reais e já está disponível "
        + "para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();



    }
}

