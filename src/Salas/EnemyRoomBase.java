package Salas;

import Interfaces.Room;
import Jugador.Player;

public class EnemyRoom implements Room {
    private String nombreEnemigo;
    private int saludEnemigo;
    private int ataqueEnemigo;

    public EnemyRoom() {
        this.nombreEnemigo = "👹 Troll novato";
        this.saludEnemigo = 20;
        this.ataqueEnemigo = 5;
    }

    @Override
    public void entrar(Player player) {
        System.out.println("Has entrado en una sale con un enemigo: " + nombreEnemigo);
        System.out.println("Combate iniciado");

        while (saludEnemigo > 0 && player.estaVivo()) {
            int dañoJugador = player.ataqueTotal();
            saludEnemigo -= dañoJugador;
            System.out.println("Atacaste a " + nombreEnemigo + " <UNK>: " + saludEnemigo + " le has causado "+ dañoJugador + " de daño. Salud restante del enemigo. " + Math.max(0,saludEnemigo));

            if (saludEnemigo <= 0) {
                System.out.println("Has derrotado a " + nombreEnemigo + "!");
                break;
            }
            player.recibirDaño(ataqueEnemigo);
            if(!player.estaVivo()) {
                System.out.println("💀 Has sido derrotado por "+ nombreEnemigo);
                break;
            }
        }
    }
}
