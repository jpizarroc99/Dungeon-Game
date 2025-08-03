package Objetos;

import Interfaces.GameObject;
import Jugador.Player;

public class Arma implements GameObject {
    private String nombre;
    private int poder;

    public Arma(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    public int getPoder() {
        return poder;
    }

    @Override
    public void interactuar(Player player) {
        player.agregarObjeto(this);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (💥 Poder: " + poder + ")";
    }
}



