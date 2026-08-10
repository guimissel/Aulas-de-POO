package formula1;

import java.util.List;
import java.util.ArrayList;

public class Equipe {
  private String nome;
  private int anoFundacao;
  private List<Patrocinador> patrocinadores;

  public Equipe (String nome, int anoFundacao, List<Patrocinador> patrocinadores) {
    if (nome.trim().isEmpty()) throw new IllegalArgumentException("Nome vazio");

    this.nome = nome.trim();
    this.anoFundacao = anoFundacao;
    this.patrocinadores = new ArrayList<>(patrocinadores);
  }

  public String getNome() {
    return this.nome;
  }

  public int getAnoFundacao() {
    return this.anoFundacao;
  }

  public List<Patrocinador> getPatrocinadores() {
    return this.patrocinadores;
  }

  public String toString() {

    String dados = "\n\n----- EQUIPE -----\n\n" +
            "Nome: " + this.nome +
            "\nAno de fundação: " + this.anoFundacao +
            "\n\n-----PATROCINADORES -----";
    for(Patrocinador patrocinador : this.patrocinadores) {
      dados += patrocinador.toString();
    }

    return dados;
  }
}
