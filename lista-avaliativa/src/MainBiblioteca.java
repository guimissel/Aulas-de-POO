import biblioteca.Livro;
import biblioteca.Periodico;

public class MainBiblioteca {
  public static void main(String[] args) {
    Livro livro = new Livro("Hora da Estrela");
    Periodico periodico = new Periodico("Exercícios físicos como ferramenta de prevenção e tratamento da depressão", 5);

    System.out.println("Livro: " + livro.getTitulo());
    System.out.println("Periódico: " + periodico.getTitulo());

    livro.emprestar();
    System.out.println("Estado de " + livro.getTitulo() + ": " + ((livro.isDisponivel()) ? "Disponível" : "Emprestado"));

    livro.emprestar();
    livro.devolver();
    System.out.println("Estado de " + livro.getTitulo() + ": " + ((livro.isDisponivel()) ? "Disponível" : "Emprestado"));
    livro.devolver();
    System.out.println("Estado de " + livro.getTitulo() + ": " + ((livro.isDisponivel()) ? "Disponível" : "Emprestado"));
  }
}
