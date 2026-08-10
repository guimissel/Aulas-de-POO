package formula1;

public class Carro {
  private int numero;
  private int posicao;
  private Equipe equipe;
  private Piloto piloto;

  public Carro(int numero, int posicao, Equipe equipe, Piloto piloto) {
    if (numero < 0) throw new IllegalArgumentException("Numero negativo");
    if (posicao <= 0) throw new IllegalArgumentException("Posicao menor que 1");

    this.numero = numero;
    this.posicao = posicao;
    this.equipe = equipe;
    this.piloto = piloto;
  }

  public int getNumero() {
    return this.numero;
  }

  public int getPosicao() {
    return this.posicao;
  }

  public Equipe getEquipe() {
    return this.equipe;
  }

  public Piloto getPiloto() {
    return this.piloto;
  }

  public String toString() {
    return "\n\n----- CARRO -----\n\n" +
            "Número: " + this.numero +
            "\nPosição: " + this.posicao +
            equipe.toString() +
            piloto.toString();
  }
}
