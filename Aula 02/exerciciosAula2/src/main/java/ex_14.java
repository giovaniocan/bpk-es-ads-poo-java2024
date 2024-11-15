import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();

        String novaPalavra = palavra.toLowerCase();
        int nVogais = 0;

        for (int i = 0 ; i < novaPalavra.length(); i++) {
            char letra = novaPalavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                nVogais++;
            }

        }

        System.out.println("A palavra " + palavra + " tem " + nVogais + " vogais");


    }


}
