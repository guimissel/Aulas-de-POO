import lampada.Lampada; // importa a classe Lampada

public class Main {
  public static void main(String[] args) {
    Lampada lampada1 = new Lampada(); // cria lampada com valores padrao (acesa = false, watts = 60.0)
    Lampada lampada2 = new Lampada(true); // cria lampada com acesa = true e watts padrao (60.0)
    Lampada lampada3 = new Lampada(true, 120.0); // cria lampada com acesa = true e watts = 120
    // Lampada lampada4 = new Lampada(true, 0.8); lancara erro de argumento invalido

    lampada1.mostrarEstado(); // mostra se lampada esta acesa ou apagada
    System.out.println("Potencia: " + lampada1.getWatts() + "W"); // imprime potencia da lampada
    lampada1.interruptor(); // liga se estiver desligada e desliga se estiver ligada
    // lampada1.setWatts(0.5); tenta mudar valor de watts -> lancara erro de argumento invalido
    // lampada1.setWatts(1000.3); tenta mudar valor de watts -> lancara erro de argumento invalido
    lampada1.setWatts(180.0); // muda potencia da lampada
    System.out.println("Potencia: " + lampada1.getWatts() + "W"); // imprime potencia da lampada
  }
}
