
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int conta;
        String agencia;
        String NomeCliente;
        double saldo;

        System.out.println("Bem vindo ao nosso sistema bancario, para iniciar sua consulta, prescisamos que forneça os segintes dedos.");
        System.out.println("Numero da conta: ");
        conta = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Agência: ");
        agencia = entrada.nextLine();

        System.out.println("Seu nome: ");
        NomeCliente = entrada.nextLine();

        System.out.println("Valor depositado: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}