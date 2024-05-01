import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Como estou fazendo no windows, para garantir nenhuma confusão
        // foi Adicionado o Locale para que quando for digitado o saldo da conta,
        // que é um número decimal, para que ele seja lido utilizando o "."
        // ao invés da vírgula!
        scanner.useLocale(Locale.US);
        int numero;
        String nome, agencia;
        double saldo;
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digie sua agência: ");
        agencia = scanner.next();
        scanner.nextLine();
        System.out.print("Digite o numero da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
