package exercicio01;

import java.util.Scanner;

public class Estudante {
  private String nome;
  private double[] notas;

  // inicializa o nome e 5 notas
  public Estudante(String nome) {
    this.nome = nome;
    this.notas = new double[5];
  }

  public String getNome() {
    return this.nome;
  }

  public double[] getNotas() {
    return this.notas;
  }

  public void insereNotas() {
    Scanner scanner = new Scanner(System.in);

    // percorre todas as 5 posicoes do array
    for (int i = 0; i < this.notas.length; i++) {
      System.out.println("Nota " + (i + 1) + ": ");
      this.notas[i] = scanner.nextDouble();

      // impede que o usuario digite uma nota menor que 0
      while (this.notas[i] < 0) {
        System.out.println("A nota não pode ser menor que 0. Nota " + (i + 1) + ": ");
        this.notas[i] = scanner.nextDouble();
      }
    }
  }

  public double calculaMedia() {
    double somaNotas = 0;

    for (double nota : this.notas) {
      somaNotas += nota;
    }

    return somaNotas / this.notas.length;
  }

  public double menorNota() {
    double menorNota = 0;

    // percorre todo o array de notas
    for (int i = 0; i < this.notas.length; i++) {
      if (i == 0) {
        menorNota = this.notas[i];
      } else {
        if (this.notas[i] < menorNota) menorNota = this.notas[i];
      }
    }

    return menorNota;
  }
}
