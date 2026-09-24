import exercicioteatro.Espetaculo;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int numeroIngresso = 1;
    int opcaoDigitada = 0;
    int lugar;
    int tipoLocalidade;

    Scanner scanner = new Scanner(System.in);

    Map<Integer, String> opcoes = new TreeMap<>(Map.of(
            1, "Vender Ingresso",
            2, "Bloquear lugares",
            3, "Ver se localidade está lotada",
            4, "Ver total arrecadado"
    ));

    Map<Integer, String> localidades = new TreeMap<>(Map.of(
            1, "Plateia Baixa",
            2, "Plateia Alta",
            3, "Mezanino"
    ));

    Espetaculo espetaculo = new Espetaculo("Teste", 120.0, numeroIngresso);

    do {
      System.out.println("Escolha uma opção ou digite outro número para sair:\n");
      opcoes.forEach((opcao, texto) -> {
        System.out.println(opcao + " - " + texto);
      });
      System.out.print("\n> ");

      opcaoDigitada = scanner.hasNextInt() ? scanner.nextInt() : -1;

      if (opcoes.containsKey(opcaoDigitada)) {
        switch (opcaoDigitada) {
          case 1:
            // vender ingresso
            System.out.print("Tipo de localidade:\n");
            localidades.forEach((opcao, texto) -> {
              System.out.println(opcao + " - " + texto + " (" + espetaculo.getPrecoIngresso(opcao) + ")");
            });
            System.out.print("\n> ");
            tipoLocalidade = scanner.hasNextInt() ? scanner.nextInt() : 1;

            if (!localidades.containsKey(tipoLocalidade)) throw new IllegalArgumentException("Erro: tipo de localidade não existe");

            System.out.println("Assentos disponíveis:\n");
            espetaculo.assentosDisponiveis(tipoLocalidade);

            System.out.print("\n> ");

            if (scanner.hasNextInt()) {
              lugar = scanner.nextInt();
            } else {
              throw new IllegalArgumentException("Erro: lugar não existe");
            }

            if (!espetaculo.lugarDisponivel(tipoLocalidade, lugar)) throw new IllegalArgumentException("Erro: lugar não disponível");

            espetaculo.venderIngresso(tipoLocalidade, lugar, numeroIngresso);
            System.out.println("Ingresso " + numeroIngresso + " no lugar " + lugar + " vendido!\n");
            numeroIngresso++;

            break;
          case 2:
            // bloquear lugares
            System.out.print("Tipo de localidade:\n");
            localidades.forEach((opcao, texto) -> {
              System.out.println(opcao + " - " + texto + " (" + espetaculo.getPrecoIngresso(opcao) + ")");
            });
            System.out.print("\n> ");
            tipoLocalidade = scanner.hasNextInt() ? scanner.nextInt() : 1;

            if (!localidades.containsKey(tipoLocalidade)) throw new IllegalArgumentException("Erro: tipo de localidade não existe");

            System.out.println("Assentos disponíveis:\n");
            espetaculo.assentosDisponiveis(tipoLocalidade);

            System.out.print("\n> ");

            if (scanner.hasNextInt()) {
              lugar = scanner.nextInt();
            } else {
              throw new IllegalArgumentException("Erro: lugar não existe");
            }

            if (!espetaculo.lugarDisponivel(tipoLocalidade, lugar)) throw new IllegalArgumentException("Erro: lugar não disponível");

            espetaculo.bloquearLugar(tipoLocalidade, lugar);
            System.out.println("Lugar " + lugar + " bloqueado!\n");

            break;
          case 3:
            // ver se localidade está lotada
            System.out.print("Tipo de localidade:\n");
            localidades.forEach((opcao, texto) -> {
              System.out.println(opcao + " - " + texto + " (" + espetaculo.getPrecoIngresso(opcao) + ")");
            });
            System.out.print("\n> ");
            tipoLocalidade = scanner.hasNextInt() ? scanner.nextInt() : 1;

            if (!localidades.containsKey(tipoLocalidade)) throw new IllegalArgumentException("Erro: tipo de localidade não existe");

            if (espetaculo.isLotada(tipoLocalidade)) {
              System.out.println(localidades.get(tipoLocalidade) + " lotada");
            } else {
              System.out.println(localidades.get(tipoLocalidade) + " possui lugares disponíveis");
            }

            break;
          case 4:
            // ver total arrecadado
            System.out.println("Total arrecadado: R$" + espetaculo.getTotalArrecadado());
        }
      }
    } while (opcoes.containsKey(opcaoDigitada));

    scanner.close();
  }
}
