package Salas;

import Interfaces.Room;
import Jugador.Player;
import Objetos.Arma;

import java.util.Scanner;

public class ArsenalRoom2 implements Room {
    @Override
    public void entrar(Player player) {
        System.out.println("Has entrado a una sala de armas \nVes una espada en llamas colgada en la pared 🔥");
        //Agregar arma al inventario
        Arma espada = new Arma("🗡️ Espada de Fuego 🔥", 30);
        espada.interactuar(player);
        //Equipar arma
        System.out.println("¿Quieres equipar el arma recién obtenida?");
        System.out.println("1. sí");
        System.out.println("2. no");

        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.nextLine().toLowerCase().trim();

        if (respuesta.equals("si")) {
            // Equipar el arma recién agregada (última del inventario)
            player.setArmaEquipada(espada);
            System.out.println("Has equipado el " + espada.getNombre() + ".");
        } else {
            System.out.println("Has decidido guardar el arma en tu inventario.");
        }
        return;
    }

    @Override
    public String getPasilloDescripcion() {
        return "⚙️ El pasillo vibra con energía de combate.";
    }
}