import java.util.Arrays;
import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println("Digite o numero " + i + ": ");
            numeros[i-1] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Numero " + (i+1) + ": " + numeros[i]);
        }

    }

}
