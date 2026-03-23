import java.util.Scanner;

public class ContarVogais {
    public static void main(String [] arguments){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Digite alguma palavra: ");
        String texto = sc.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            char aznable = Character.toLowerCase(texto.chartAt(i)); // haha funny Gundam reference
            if(aznable == 'a' || aznable == 'e' || aznable == 'i' || aznable == 'o' || aznable == 'u'){
                contador++;
            }
        }
        System.out.println("Quantidade de vogais: " + contador);
    }
}