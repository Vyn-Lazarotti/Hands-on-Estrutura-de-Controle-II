import java.util.Scanner;

public class InverterString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma palavra: ");
    String texto = sc.next();
    String invertida = "";

    for (int i = texto.length() - 1; i >= 0; i--) {
      invertida += texto.charAt(i);
    }
    System.out.println("String invertida: " + invertida);
  }
}