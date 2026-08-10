import lampada.Lampada; // importa a classe Lampada
import formula1.*;

import java.util.ArrayList;
import java.util.List;

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

    // ------- Fórmula 1 -------
    Piloto piloto = new Piloto("Lewis Hamilton", 41, "UK", 105);
    Engenheiro engenheiro = new Engenheiro("Guilherme", 17, "BR", piloto);

    List<Patrocinador> patrocinadores = new ArrayList<>();

    Patrocinador shell = new Patrocinador("Shell", 100000.0);
    Patrocinador rolex = new Patrocinador("Rolex", 500000.0);

    patrocinadores.add(shell);
    patrocinadores.add(rolex);

    Equipe equipe = new Equipe("Ferrari", 1929, patrocinadores);
    Carro carro = new Carro(5, 1, equipe, piloto);

    System.out.println(carro.toString() + engenheiro.toString());
  }
}
