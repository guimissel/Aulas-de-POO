package exercicio.excecao.contas;

public class ContaException extends RuntimeException {
  public ContaException(String mensagem) {
    super(mensagem);
  }
}
