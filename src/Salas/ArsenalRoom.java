package Salas;

import Interfaces.Room;
import Jugador.Player;
import Objetos.Arma;
import java.util.Scanner;

public class ArsenalRoom implements Room {
    @Override
    public void entrar(Player player) {
        System.out.println("Has entrado en una sala de Armas \nEncontraste un arco y una flechas 🏹");
        //Agregar arma al inventario
        Arma arco = new Arma("Arco y Flecha 🏹 del guardián", 15);
        arco.interactuar(player);
        //Equipar arma
        System.out.println("¿Quieres equipar el arma recién obtenida?");
        System.out.println("Sí");
        System.out.println("No");

        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.nextLine().toLowerCase().trim();

        if (respuesta.equals("si")) {
            // Equipar el arma recién agregada (última del inventario)
            player.setArmaEquipada(arco);
            System.out.println("Has equipado el " + arco.getNombre() + ".");
        } else {
            System.out.println("Has decidido guardar el arma en tu inventario.");
        }
        return;
    }
    @Override
    public String getPasilloDescripcion() {
        return "🐜 El pasillo tiene una estatua de hormiga gigante.";
    }
}
