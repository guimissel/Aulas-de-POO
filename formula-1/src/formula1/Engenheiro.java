package formula1;

public class Engenheiro extends Pessoa {
  private Piloto piloto;

  public Engenheiro (String nome, int idade, String nacionalidade, Piloto piloto) {
    super(nome, idade, nacionalidade);
    this.piloto = piloto;
  }

  public Piloto getPiloto() {
    return this.piloto;
  }

  @Override
  public String toString() {
    return "\n\n----- ENGENHEIRO -----\n\n" +
            "Nome: " + this.getNome() +
            "\nIdade: " + this.getIdade() +
            "\nNacionalidade: " + this.getNacionalidade() +
            "\nPiloto: " + this.getPiloto().getNome();
  }
}