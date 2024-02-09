import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner escaner = new Scanner(System.in);

        System.out.println();
        System.out.println("****************************************");
        System.out.println("Simulado de Conta Bancaria");
        System.out.println("****************************************");
        System.out.println();

        System.out.print("Por favor, digite o número da conta: ");
        int conta = escaner.nextInt();
        System.out.println();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = escaner.next();
        escaner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite seu nome completo: ");
        String nome = escaner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o saldo inicial da conta: ");
        double saldo = escaner.nextDouble();
        System.out.println();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n"
            , nome, agencia, conta, saldo);
        System.out.println();

        System.out.println("****************************************");
        System.out.println("Fim da simulação");
        System.out.println("****************************************");
        System.out.println();

        escaner.close();
    }
}
