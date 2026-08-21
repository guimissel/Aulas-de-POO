import exercicio01.Estudante;
import exercicio02.GestorEstudantes;

import java.util.ArrayList;

public class MainEstudante {
  public static void main(String[] args) {
    Estudante estudante = new Estudante("Guilherme");

    System.out.println("Nome: " + estudante.getNome() + "\n");
    System.out.println("Inserir notas:\n");

    estudante.insereNotas();
    double media = estudante.calculaMedia();

    // mostra notas, media e menor nota
    System.out.println("\nNotas:\n\n");
    for (double nota : estudante.getNotas()) {
      System.out.println(nota + "\n");
    }
    System.out.println("\nMédia: " + estudante.calculaMedia());
    System.out.println("Média ponderada: " + estudante.calculaMedia(new double[]{1, 2, 3, 2, 2}));
    System.out.println("Menor nota: " + estudante.menorNota());

    Estudante estudante2 = new Estudante("Júlia");
    estudante2.insereNotas();

    ArrayList<Estudante> estudantes = new ArrayList<>();
    estudantes.add(estudante);
    estudantes.add(estudante2);

    ArrayList<Estudante> aprovados = GestorEstudantes.getAprovados(estudantes);

    System.out.println("Aprovados:\n");
    if (aprovados != null) {
      for (Estudante aprovado : aprovados) {
        System.out.println(aprovado.getNome());
      }
    } else {
      System.out.println("Nenhum aluno foi aprovado");
    }
  }
}
