import java.util.Scanner;

public class ex_07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("A soma dos números é: " + Soma(numero1, numero2));

    }

    private static int Soma(int n1, int n2) {
        return n1 + n2;
    }
}
