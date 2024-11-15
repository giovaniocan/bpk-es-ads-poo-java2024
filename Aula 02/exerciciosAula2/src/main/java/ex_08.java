import java.util.Scanner;

public class ex_08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("\n Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("\n Seu nome é " + nome + " e você tem " + idade + " anos.");

    }
}
