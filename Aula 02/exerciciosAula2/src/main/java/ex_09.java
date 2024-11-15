import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operacao que voce deseja realizar '+' '-' '/' '*': ");
        String operacao = scanner.nextLine();

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case "/":
                System.out.println("Resultado: " + (numero1 / numero2));
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }

    }

}
