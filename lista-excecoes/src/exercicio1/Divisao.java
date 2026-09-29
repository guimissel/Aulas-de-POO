package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int quantNumeros = 2;
    int[] numeros = new int[quantNumeros];

    for (int i = 0; i < quantNumeros; i++) {
      boolean inputValido = false;

      while (!inputValido) {
        try {
          System.out.print("Digite o " + (i + 1) + " número: ");
          numeros[i] = scanner.nextInt();
          inputValido = true;
        } catch (InputMismatchException e) {
          System.out.println("Número inválido! Digite novamente.");
          scanner.nextLine();
        }
      }
    }

    int resultado = numeros[0];
    boolean divisaoDeuCerto = false;

    for (int i = 1; i < quantNumeros; i++) {
      divisaoDeuCerto = false;
      try {
        resultado = resultado / numeros[i];
        divisaoDeuCerto = true;
      } catch (ArithmeticException e) {
        System.out.println("Erro! Não é possível dividir " + resultado + " por 0!");
        break;
      }
    }

    if (divisaoDeuCerto) System.out.println("Resultado: " + resultado);

    scanner.close();
  }
}
