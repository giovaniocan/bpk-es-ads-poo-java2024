import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero");
        numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é ímpar");
        }

    }
}
