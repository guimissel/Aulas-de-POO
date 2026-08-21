package biblioteca;

public class Livro extends Publicacao {
  private boolean disponivel;

  public Livro(String titulo) {
    super(titulo);
    this.disponivel = true;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void emprestar() {
    if (this.disponivel) {
      this.disponivel = false;
    } else {
      System.out.println("Nao é possível emprestar o livro. Ele não está disponível");
    }
  }

  public void devolver() {
    if (!this.disponivel) {
      this.disponivel = true;
    } else {
      System.out.println("Como você está devolvendo um livro que não está emprestado???");
    }
  }
}
