package Salas;

import Interfaces.Room;
import Jugador.Player;
import Objetos.Arma;

public class TreasureRoom implements Room {
    @Override
    public void entrar(Player player) {
        System.out.println("Has entrado a una sala de tesoros \nEncontraste un cofre repleto de monedas de oro 💰!!");
    }
    @Override
    public String getPasilloDescripcion() {
        return  "🖼️ El pasillo está decorado con cuadros antiguos." ;
    }
}