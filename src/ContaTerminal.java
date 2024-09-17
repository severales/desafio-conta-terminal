import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, por favor informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua âgencia: ");
        String agencia = sc.nextLine();
        System.out.println("Informe o número da sua conta: ");
        int numero = sc.nextInt();
        System.out.println("Informe seu saldo atual: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " +numero + " e seu saldo R$: " +saldo + " já está disponível para saque.");
        
    }
}
