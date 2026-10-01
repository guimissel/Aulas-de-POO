package exercicio4;

public class MinhaExcecao extends RuntimeException {
  public MinhaExcecao(String mensagem) {
    super(mensagem);
  }
}