import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
