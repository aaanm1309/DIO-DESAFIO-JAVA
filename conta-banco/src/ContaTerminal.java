import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args)  {

        Scanner scanner =  new Scanner(System.in);

        int numeroAgencia;
        String numeroConta;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numeroAgencia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite a numero da Conta !");
        numeroConta = scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo da Conta !");
        saldo = scanner.nextDouble();
        scanner.close();

         System.out.println(
             "Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, "+
             "sua agência é "+numeroAgencia+
             ", conta "+ numeroConta +" e seu saldo "+saldo+
             " já está disponível para saque");

    }
}
