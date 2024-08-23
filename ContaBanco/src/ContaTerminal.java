import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCompleto;
        String agencia;

        int numeroConta = 0;
        double saldo = 0;
        

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = Integer.parseInt(scan.nextLine());

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite o nome completo do Cliente !");
        nomeCompleto = scan.nextLine();

        System.out.println("Por favor, digite o saldo disponivel para o Cliente !");
        saldo = scan.nextDouble();

        System.out.println("Olá ".concat(nomeCompleto)
                                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                                    .concat(agencia)
                                    .concat(", conta ")
                                    + numeroConta +
                                    " e seu saldo disponivel é : %.2f".formatted(saldo));

    }
}
