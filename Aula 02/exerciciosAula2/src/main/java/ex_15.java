import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int interativo = fatorialInterativo(numero);
        int recursivo = fatorialRecursivo(numero);

        System.out.println("Fatorial (Iterativo) de " + numero + " é: " + interativo);
        System.out.println("Fatorial (Recursivo) de " + numero + " é: " + recursivo);

    }
    public static int fatorialInterativo(int numero){
        int fatorial = 1;
        for(int i = 1; i<=numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }else{
            return  numero * fatorialRecursivo(numero - 1);
        }
    }

}
