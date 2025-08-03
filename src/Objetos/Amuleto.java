package Objetos;


import Interfaces.GameObject;
import Jugador.Player;

public class Amuleto implements GameObject {
    private String nombre;
    private int poderCuracion;

    public Amuleto(String nombre, int poderCuracion) {
        this.nombre = nombre;
        this.poderCuracion = poderCuracion;
    }

    @Override
    public void interactuar(Player player) {
        player.restaurarSalud(poderCuracion);
        System.out.println("El amuleto ✨🔮 te ha curado " + poderCuracion + " puntos de salud.");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
