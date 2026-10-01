package exercicio.excecao.contas;

public class TesteConta {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria(0.0, 500.0);

    // conta.depositar(1200);
    // conta.sacar(10);
    conta.depositar(20);
    // conta.sacar(550);
    conta.sacar(20);
  }
}
