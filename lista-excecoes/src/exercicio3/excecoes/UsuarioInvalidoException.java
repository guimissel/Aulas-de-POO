package exercicio3.excecoes;

public class UsuarioInvalidoException extends RuntimeException {
  public UsuarioInvalidoException(String mensagem) {
    super(mensagem);
  }
}
