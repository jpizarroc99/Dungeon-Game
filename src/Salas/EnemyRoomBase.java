package Salas;

import Interfaces.Room;
import Jugador.Player;

import java.util.Scanner;



public class EnemyRoomBase implements Room {
    private String nombreEnemigo;
    private int saludEnemigo;
    private int ataqueEnemigo;


    public EnemyRoomBase(String nombreEnemigo, int saludEnemigo, int ataqueEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
        this.saludEnemigo = saludEnemigo;
        this.ataqueEnemigo = ataqueEnemigo;
    }

    @Override
    public void entrar(Player player) {
        System.out.println("⚔️ Ha aparecido un enemigo: " + nombreEnemigo);
        Scanner teclado = new Scanner(System.in);

        while (saludEnemigo > 0 && player.getSalud() > 0) {
            // Turno del jugador
            int daño = player.getAtaqueTotal();
            if (Math.random() < 0.2) {
                System.out.println(nombreEnemigo + " esquivo tu ataque!");
            } else {
                saludEnemigo -= daño;
                System.out.println("💥 Atacas a " + nombreEnemigo + " le has causado " + daño + " de daño.");
            }
            //Modo furia enemigo
            if(saludEnemigo > 0 && saludEnemigo < 20) {
                ataqueEnemigo += 5;
                System.out.println(nombreEnemigo + " ha entrado en modo fuiria ¡cuidado!.");
            }
            //Turno del enemigo
            if (saludEnemigo > 0) {
                int ataqueFinal = ataqueEnemigo;
                if (Math.random() < 0.1) {
                    ataqueFinal *= 2;
                    System.out.println("¡" + nombreEnemigo + " ha lanzado un ataque crítico!");
                }
                player.recibirDaño(ataqueFinal);
            }
            //Mostrar estado
            System.out.println(" Tu salud " + player.getSalud() + " | 😈 Salud de " + nombreEnemigo + ": " + saludEnemigo);
        }
        if (player.getSalud() <=0 ) {
            System.out.println("💀 Has sido derrotado por " + nombreEnemigo + ".");
        } else {
            System.out.println("🏆 Has vencido a " + nombreEnemigo + "!");
        }
    }
    @Override
    public String getPasilloDescripcion () {
        return "Un pasillo silencioso antes de enfrentar al enemigo.";
    }
}
