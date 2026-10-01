package exercicio3.excecoes;

public class SenhaInvalidaException extends RuntimeException {
  public SenhaInvalidaException(String mensagem) {
    super(mensagem);
  }
}
