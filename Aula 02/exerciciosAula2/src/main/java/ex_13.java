import java.util.Random;
import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);

        int tentativas = 0;
        int palpite = -1;

        System.out.println("Bem vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando entre 0 e 100.");

        while(palpite != numeroAleatorio){
            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if(palpite == numeroAleatorio){
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            } else if(palpite < numeroAleatorio){
                System.out.println("O número que estou pensando é maior que " + palpite);
            } else {
                System.out.println("O número que estou pensando é menor que " + palpite);
            }
        }

    }


}
