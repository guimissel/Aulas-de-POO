package formula1;

public class Patrocinador {
  private String nome;
  private double valor;

  public Patrocinador(String nome, double valor) {
    if (nome.trim().isEmpty()) throw new IllegalArgumentException("Nome vazio");
    if (valor <= 0) throw new IllegalArgumentException("Valor negativo");

    this.nome = nome.trim();
    this.valor = valor;
  }

  public String getNome() {
    return this.nome;
  }

  public double getValor() {
    return this.valor;
  }

  public String toString() {
    return "\n\nNome: " + this.nome +
            "\nValor: $" + this.valor;
  }
}
