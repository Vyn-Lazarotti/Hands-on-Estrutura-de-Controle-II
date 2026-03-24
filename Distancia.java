import java.util.Scanner;

public class Distancia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x1, x2, y1, y2, distancia, raioT = 6371.01;
    System.out.print("Digite a primeira coordenada: ");
    x1 = sc.nextDouble();
    System.out.print("Digite a segunda coordenada: ");
    x2 = sc.nextDouble();
    System.out.print("Digite a terceira coordenada: ");
    y1 = sc.nextDouble();
    System.out.print("Digite a quarta coordenada: ");
    y2 = sc.nextDouble();
    distancia = raioT * (Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    System.out.print("A distância entre esses pontos é de " + distancia + " km");
    sc.close();
  }
}