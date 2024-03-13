import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in);

        int Numero;
        String Agencia, NomeCliente;
        double Saldo;

        System.out.println("Por favor, digite o número da Agência");
        
        Numero = scanner.nextInt();

        System.out.println("");
    }
}
