package lampada;

//Escreva um construtor para a classe Lampada de forma que instâncias desta só possam ser criadas se um estado inicial for passado para o construtor. Esse estado pode ser o valor booleano que indica se a lâmpada está acesa (true) ou apagada (false). Crie o método interruptor para trocar o estado e dizer se a lâmpada está acesa ou apagada. Crie um método que exiba se a mesma está acesa ou apagada.
//
//Considere a classe Lampada que também representa o número de watts da lâmpada (veja o exercício 4). Escreva dois construtores para a classe: um que recebe como argumentos o número de watts da lâmpada, e outro, sem argumentos, que considera que a lâmpada tem 60 watts por default.
//
//Considere a classe Lampada dos exercícios anteriores crie um método get e set que garanta que a potencia esteja em uma escala de 1 a 1000
//
//Comentários identificando cada uma das partes essenciais de uma classe (variáveis, construtor, método) e explicando em 1 ou 2 linhas (no mínimo) o que cada trecho do código faz (por exemplo, explicando a diferença entre os dois construtores do exercício)

public class Lampada {
  private boolean acesa; // definicao do atributo acesa (variavel booleana que indica se a lampada esta acesa (true) ou apagada (false)
  private double watts; // definicao do atributo watts que indica a potencia da lampada de 1.0 a 1000.0

  public Lampada() { // construtor utilizado quando nao forem passados argumentos
    this.acesa = false; // inicializa o objeto com acesa igual a false por padrao
    this.watts = 60.0; // inicializa o objeto com watts igual a 60 por padrao
  }

  public Lampada(boolean acesa) { // construtor utilizado quando so acesa e passado como argumento
    this.acesa = acesa; // inicializa o objeto com atributo acesa igual ao argumento passado (true ou false)
    this.watts = 60.0; // inicializa o objeto com watts igual a 60 por padrao
  }

  public Lampada(boolean acesa, double watts) { // construtor utilizado quando ambos os parametros sao passados
    this.acesa = acesa; // inicializa o objeto com atributo acesa igual ao argumento passado (true ou false)

    if (watts < 1) throw new IllegalArgumentException("Watts nao pode ser menor que 1"); // se a lampada tiver potencia invalida (menor que 1.0), Java lanca um erro de Argumento Invalido
    this.watts = watts; // se for maior ou igual a 1, inicializa watts com o valor do argumento
  }

  public double getWatts() { // metodo get para acessar o valor do atributo watts
    return this.watts;
  }

  public void setWatts(double watts) { // metodo set para alterar o valor do atributo watts de maneira segura
    // se watts passado no argumento for menor que 1.0 ou maior que 1000.0, Java lanca erro de Argumento Invalido
    if (watts < 1 || watts > 1000) throw new IllegalArgumentException("Watts deve ser entre 1W e 1000W");
    this.watts = watts; // se estiver entre um intervalo fechado de 1.0 a 1000.0, modifica o valor
  }

  public void mostrarEstado() {
    if (this.acesa) { // se estiver acesa, printa na tela que esta acesa
      System.out.println("Lampada acesa");
    } else { // se estiver apagada, printa na tela que esta apagada
      System.out.println("Lampada apagada");
    }
  }

  public void interruptor() {
    this.acesa = !this.acesa; // muda o valor booleano para seu oposto (se for true, vira false, se for false, vira true)
    this.mostrarEstado(); // chama o metodo de mostrar estado
  }
}
