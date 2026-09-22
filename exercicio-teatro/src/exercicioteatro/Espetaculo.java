package exercicioteatro;

public class Espetaculo {
  private String nome;
  private int[] plateiaBaixa;
  private int[] plateiaAlta;
  private int[] mezanino;
  private double totalArrecadado;
  private double precoIngressoPlateiaBaixa;
  private int ultimoIngresso;

  public Espetaculo(String nome, double precoIngressoPlateiaBaixa, int numeroPrimeiroIngresso) {
    if (nome.trim().isEmpty()) throw new IllegalArgumentException("Erro: o nome do espetáculo não pode estar vazio");
    if (precoIngressoPlateiaBaixa < 0) throw new IllegalArgumentException("Erro: o preço do ingresso não pode ser menor que 0");

    this.nome = nome.trim();
    this.precoIngressoPlateiaBaixa = precoIngressoPlateiaBaixa;
    this.ultimoIngresso = numeroPrimeiroIngresso;
    this.plateiaBaixa = new int[20];
    this.plateiaAlta = new int[25];
    this.mezanino = new int[12];
    this.totalArrecadado = 0.0;
  }

  public String getNome() {
    return this.nome;
  }

  public int[] getPlateiaBaixa() {
    return this.plateiaBaixa;
  }

  public int[] getPlateiaAlta() {
    return this.plateiaAlta;
  }

  public int[] getMezanino() {
    return this.mezanino;
  }

  public double getTotalArrecadado() {
    return this.totalArrecadado;
  }

  public double getPrecoIngressoPlateiaBaixa() {
    return this.precoIngressoPlateiaBaixa;
  }

  public int getUltimoIngresso() {
    return this.ultimoIngresso;
  }

  public void bloquearLugar(int tipoLocalidade, int lugar) {
    if (tipoLocalidade == 1) {
      if (this.plateiaBaixa[lugar] == 0) {
        this.plateiaBaixa[lugar] = -1;
      }
    } else if (tipoLocalidade == 2) {
      if (this.plateiaAlta[lugar] == 0) {
        this.plateiaAlta[lugar] = -1;
      }
    } else if (tipoLocalidade == 3) {
      if (this.mezanino[lugar] == 0) {
          this.mezanino[lugar] = -1;
      }
    } else {
      throw new IllegalArgumentException("Erro: localidade não existe");
    }
  }

  public boolean isLotada(int tipoLocalidade) {
    if (tipoLocalidade == 1) {
      for (int lugar : this.plateiaBaixa) {
        if (lugar == 0) return false;
      }
    } else if (tipoLocalidade == 2) {
      for (int lugar : this.plateiaAlta) {
        if (lugar == 0) return false;
      }
    } else if (tipoLocalidade == 3) {
      for (int lugar : this.mezanino) {
        if (lugar == 0) return false;
      }
    } else {
      throw new IllegalArgumentException("Erro: localidade não existe");
    }

    return true;
  }

  public void venderIngresso(int tipoLocalidade, int lugar, int numeroIngresso) {
    if (lugar < 0) throw new IllegalArgumentException("Erro: lugar não existe");

    if (tipoLocalidade == 1) {
      if (lugar < this.plateiaBaixa.length - 1 && this.plateiaBaixa[lugar] == 0) {
        this.plateiaBaixa[lugar] = numeroIngresso;
        this.totalArrecadado += this.precoIngressoPlateiaBaixa;
      }
    } else if (tipoLocalidade == 2) {
      if (lugar < this.plateiaAlta.length - 1 && this.plateiaAlta[lugar] == 0) {
        this.plateiaAlta[lugar] = numeroIngresso;
        this.totalArrecadado += this.precoIngressoPlateiaBaixa * 0.75;
      }
    } else if (tipoLocalidade == 3) {
      if (lugar < this.mezanino.length - 1 && this.mezanino[lugar] == 0) {
        this.mezanino[lugar] = numeroIngresso;
        this.totalArrecadado += this.precoIngressoPlateiaBaixa * 0.55;
      }
    } else {
      throw new IllegalArgumentException("Erro: localidade não existe");
    }
  }

  public void assentosDisponiveis(int tipoLocalidade) {
    if (tipoLocalidade == 1) {
      for (int i = 0; i < this.plateiaBaixa.length; i++) {
        System.out.print(i + " ");
      }
    } else if (tipoLocalidade == 2) {
      for (int i = 0; i < this.plateiaAlta.length; i++) {
        System.out.print(i + " ");
      }
    } else if (tipoLocalidade == 3) {
      for (int i = 0; i < this.mezanino.length; i++) {
        System.out.print(i + " ");
      }
    } else {
      throw new IllegalArgumentException("Erro: localidade não existe");
    }
  }
}
