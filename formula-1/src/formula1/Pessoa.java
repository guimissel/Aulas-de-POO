package formula1;

// pessoa é abstrata porque nunca há uma ocorrência concreta de pessoa, não podemos fazer new Pessoa(). Na verdade, pessoa sempre será um piloto ou engenheiro. Pessoa é apenas um conceito geral, um modelo para as classes filhas.
public abstract class Pessoa {
  private String nome;
  private int idade;
  private String nacionalidade;

  public Pessoa(String nome, int idade, String nacionalidade) {
    if (nome.trim().isEmpty()) throw new IllegalArgumentException("Nome vazio");
    if (idade < 0) throw new IllegalArgumentException("Idade negativa");
    if (nacionalidade.trim().isEmpty()) throw new IllegalArgumentException("Nacionalidade vazia");

    this.nome = nome.trim();
    this.idade = idade;
    this.nacionalidade = nacionalidade.trim();
  }

  public String getNome() {
    return this.nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getNacionalidade() {
    return this.nacionalidade;
  }

  public abstract String toString();
}
