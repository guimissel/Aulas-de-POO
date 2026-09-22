import exercicioteatro.Espetaculo;

import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int numeroIngresso = 1;
    int opcaoDigitada = 0;

    Scanner scanner = new Scanner(System.in);

    Map<Integer, String> opcoes = Map.of(
            1, "Vender Ingresso",
            2, "Bloquear lugares",
            3, "Ver se localidade está lotada",
            4, "Ver assentos disponíveis na localidade"
    );

    Espetaculo espetaculo = new Espetaculo("Teste", 120.0, numeroIngresso);

    do {
      System.out.println("Escolha uma opção ou digite outro número para sair:\n");
      opcoes.forEach((opcao, texto) -> {
        System.out.println(opcao + " - " + texto);
      });
      System.out.println("\n> ");

      opcaoDigitada = scanner.hasNextInt() ? scanner.nextInt() : -1;

      if (opcoes.containsKey(opcaoDigitada)) {
        switch (opcaoDigitada) {
          case 1:
            // todo: adicionar as opções do menu
        }
      }
    } while (opcoes.containsKey(opcaoDigitada));

    scanner.close();
  }
}
