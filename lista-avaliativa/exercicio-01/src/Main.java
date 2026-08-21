import exercicio01.Estudante;

public class Main {
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
    System.out.println("Menor nota: " + estudante.menorNota());
  }
}
