import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe    Scanner

        //Exibir as mensagens para nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        Scanner scanner = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        
        Numero = scanner.nextInt();

        //Consumir a quebra de linha deixada na entrada
        scanner.nextLine();

        System.out.println("Por favor, digite a Agencia: ");

        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");

        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");

        Saldo = scanner.nextDouble();

        System.out.printf("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque." );

    
}
}