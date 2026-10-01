package exercicio3.excecoes;

public class CredenciaisErradasException extends RuntimeException {
  public CredenciaisErradasException(String mensagem) {

    super(mensagem);
  }
}
