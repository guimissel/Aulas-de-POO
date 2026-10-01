package exercicio4;

public class TesteExcecao {
  public static void teste() throws MinhaExcecao {
    throw new MinhaExcecao("Teste acionado");
  }

  public static void main(String[] args) {
    MinhaExcecao me = null;

    try {
      System.out.println("try");
      teste();
    } catch (MinhaExcecao e) {
      System.out.println("catch");
      me = e;
    } finally {
      System.out.println("finally");
      throw me;
    }

    System.out.println("fim"); // LETRA E) ERRO DE COMPILAÇÃO
  }
}
