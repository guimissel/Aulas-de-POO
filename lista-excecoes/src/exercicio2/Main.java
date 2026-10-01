package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int tamanho = 10;
    int[] numeros = new int[tamanho];
    int contador = 0;

    boolean concluido = false;

    Scanner scanner = new Scanner(System.in);

    do {
      try {
        System.out.print("Número " + contador + ": ");
        boolean inputValido = false;

        while (!inputValido) {
          int numero = scanner.nextInt();

          numeros[contador] = numero;

          contador++;
          inputValido = true;
          if (numero == 0) concluido = true;
        }
      } catch (InputMismatchException e) {
        System.out.println("Erro! Número inválido! Digite novamente.");
        scanner.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Erro! Array já preenchido.");
        break;
      }
    } while (!concluido);

    System.out.print("Números: ");
    for (int i = 0; i < contador; i++) System.out.print(numeros[i] + " ");

    scanner.close();
  }
}
