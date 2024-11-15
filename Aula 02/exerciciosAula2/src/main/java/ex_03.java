import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first, second;

        System.out.println("Digite o primeiro numero");
        first = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        second = scanner.nextInt();

        System.out.println("Multiplicacao: " + (first * second));
        System.out.println("Divisao: " + (first / second));
        System.out.println("Soma: " + (first + second));
        System.out.println("Subtracao: " + (first - second));
    }
}
