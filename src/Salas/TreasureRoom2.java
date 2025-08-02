package Salas;

import Interfaces.Room;
import Jugador.Player;
import Objetos.Amuleto;
import java.util.Random;

public class TrasureRoom2 implements Room {
    @Override
    public void entrar(Player player) {
        System.out.println("Has entrado a una sala de tesoros curativos...");
        Random rand = new Random();
        int chance = rand.nextInt(100);

        if (chance < 55) {
            Amuleto amuleto = new Amuleto("Amuleto Curativo", 30);
            player.agregarObjeto(amuleto);
            System.out.println("🌟 Has encontrado el " + amuleto.getNombre() + "!");
            System.out.println("Se dice que puede salvar a su portador en el momento más oscuro...");
        } else {
            System.out.println("La sala está vacía... solo el eco de tu esperanza resuena.");
        }
    }
}
