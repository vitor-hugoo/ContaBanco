
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência. Ex: 0000");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número de sua Agência com o digito. Ex: 000-0");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente.");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do depósito inicial.");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
