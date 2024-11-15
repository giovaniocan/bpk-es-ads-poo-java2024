import java.util.Scanner;

public class ex_16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão que deseja realizar:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.println("Digite a temperatura que deseja converter:");
        double temperatura = scanner.nextDouble();

        if (escolha == 1) {
            double resultado = (temperatura * 9/5) + 32;
            System.out.println(temperatura + "°C é igual a " + resultado + "°F");
        } else if (escolha == 2) {
            double resultado = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "°F é igual a " + resultado + "°C");
        } else {
            System.out.println("Escolha inválida.");
        }

    }
}