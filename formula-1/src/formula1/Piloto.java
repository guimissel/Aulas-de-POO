package formula1;

public class Piloto extends Pessoa {
  private int numeroVitorias;

  public Piloto(String nome, int idade, String nacionalidade, int numeroVitorias) {
    // super é uma função para chamar o construtor da classe mãe (que não é chamado automaticamente porque no código a gente não cria uma instância de Pessoa, mas sim de Piloto)
    super(nome, idade, nacionalidade);

    if(numeroVitorias < 0) throw new IllegalArgumentException("Numero de vitorias negativo");
    this.numeroVitorias = numeroVitorias;
  }

  public int getNumeroVitorias() {
    return this.numeroVitorias;
  }

  @Override
  public String toString() {
    return "\n\n----- PILOTO -----\n\n" +
            "Nome: " + this.getNome() +
            "\nIdade: " + this.getIdade() +
            "\nNacionalidade: " + this.getNacionalidade() +
            "\nNúmero de vitórias: " + this.numeroVitorias;
  }
}
