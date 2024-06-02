import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vinda ao banco DIO!");

        System.out.println("Por favor, digite o número da Agência!");
        String frontagencia = scanner.next();

        System.out.println("Usuario:");
        int frontusuario = scanner.nextInt();

        if(frontusuario == 1021 && frontagencia.equals("067-8")){
            System.out.print("Olá " + contaTerminal.usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia
                    + ", conta " + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo + " já está disponível para saque.");

        } else {
            System.out.print("Conta não encontrada no sistema");
        }

        scanner.close();
    }
}
