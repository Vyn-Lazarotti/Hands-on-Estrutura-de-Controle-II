import java.util.Scanner;

public class PatinhosXuxa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, patinhos;

    do{
      System.out.print("Informe o número de patos: ");
      n = sc.nextInt();
    }while(n <= 0);
    patinhos = n;

    while(patinhos > 0){
      System.out.print("\n" + patinhos + (patinhos == 1 ? " patinho foi passear\n":" patinhos foram passear\n"));
      System.out.println("""
          Além das montanhas
          Para brincar
          A mamãe gritou: Quá, quá, quá, quá
        """;);
        if(--patinhos > 0){
          System.out.println("Mas só " + patinhos + (patinhos == 1 ? patinhos + " patinho voltou de lá.\n": patinhos + " patinhos voltaram de lá.\n"));
        }
        else{
          System.out.println("Mas nenhum patinho voltou de lá.");
        }
        System.out.println("""
          A mamãe patinha foi procurar
          Além das montanhas
          Na beira do mar
          A mamãe gritou: Quá, quá, quá, quá
          """;)
        System.out.println("E " + (n==1 
          ? "o " + n + " patinho voltou "
          :" os " + n + "patinhos voltaram ") + "de lá.");
    }
  }
}