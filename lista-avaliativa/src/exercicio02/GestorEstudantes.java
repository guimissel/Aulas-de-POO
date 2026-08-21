package exercicio02;

import exercicio01.Estudante;
import java.util.ArrayList;

public class GestorEstudantes {
  public static ArrayList<Estudante> getAprovados(ArrayList<Estudante> estudantes) {
    ArrayList<Estudante> aprovados = new ArrayList<>();

    for (Estudante estudante : estudantes) {
      if (estudante.calculaMedia() > 6) aprovados.add(estudante);
    }

    // se ninguem for aprovado (lista de aprovados vazia), retorna null, senao retorna a lista
    return (aprovados.isEmpty()) ? null : aprovados;
  }
}
