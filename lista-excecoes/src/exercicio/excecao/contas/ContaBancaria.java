package exercicio.excecao.contas;

public class ContaBancaria {
  private double saldo;
  private double limite;

  public ContaBancaria(double valorSaldo, double valorLimite) {
    if (valorSaldo < 0) throw new IllegalArgumentException("O saldo não pode ser negativo");
    if (valorLimite < 0) throw new IllegalArgumentException("O limite não pode ser negativo");

    this.saldo = valorSaldo;
    this.limite = valorLimite;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getLimite() {
    return limite;
  }

  public double getSaldoComLimite() {
    return saldo + limite;
  }

  public boolean sacar(double valor) throws ContaException {
    if (valor > this.saldo) throw new ContaException("O valor do saque pode ser de até " + this.saldo);
    if (valor > 500.0) throw new ContaException("O valor do saque não pode exceder 500 reais");

    this.saldo -= valor;

    return true;
  }

  public void depositar(double valor) throws ContaException {
    if (valor > 1000) throw new ContaException("O valor do depósito não pode exceder 1000 reais");
    if (this.saldo + valor > limite) throw new ContaException("O valor do depósito não deve exceder o limite da conta");

    this.saldo += valor;
  }
}
