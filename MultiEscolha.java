import java.util.Scanner;

public class MultiEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tentativa = 0;
        boolean errou = true;

        do {

            tentativa++;
            System.out.println("Tentativas: " + tentativa);
            System.out.println("Questão\nA) \nB) \nC) \nD) \nE)");
            String resposta = teclado.nextLine();

            switch (resposta.toUpperCase()) {
                case "A":
                    System.out.println("Resposta correta!");
                    errou = false;
                    break;
                case "B":
                case "C":
                case "D":
                case "E":
                    System.out.println("Resposta incorreta!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    tentativa--;
                    break;

            }

        } while (!errou && tentativa < 3);

        if (errou) {
            System.out.println("Acabaram as chances :)");
        }

        
        teclado.close();
    }
}
