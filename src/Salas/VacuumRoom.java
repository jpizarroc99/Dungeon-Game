package Salas;

import Interfaces.Room;
import Jugador.Player;

public class VacuumRoom implements Room {
    @Override
    public void entrar(Player player) {
        System.out.println("Has entrado a una sala vacía, aquí no hay nada");
    }

    @Override
    public String getPasilloDescripcion() {
        return "🌸 El pasillo está cubierto por flores.";
    }
}
