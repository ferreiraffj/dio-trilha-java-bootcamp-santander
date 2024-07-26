import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, digite o número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Muito bem, agora digite o número da Agência com dígito! Exemplo: 1234-5");
            String agencia = scanner.nextLine();

            System.out.println("Ótimo! Por favor, digite o seu nome completo: ");
            String nome = scanner.nextLine();

            System.out.println("Pra finalizar, digite o seu saldo inicial: ");
            double saldo = scanner.nextDouble();

            System.out.printf("\nBem vindo(a) %s!\nObrigado por criar uma conta em nosso banco, sua agência é %s, o número da sua conta é %d e seu saldo é de R$ %.2f reais.%n", nome, agencia, numero, saldo);

            scanner.close();
    }
}