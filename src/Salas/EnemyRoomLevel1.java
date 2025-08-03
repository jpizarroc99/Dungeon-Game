package Salas;
import Jugador.Player;

public class EnemyRoomLevel1 extends EnemyRoomBase {
    public EnemyRoomLevel1() {
        super("🐜 Hormiga Soldado", 20, 5);
    }

    @Override
    public String getPasilloDescripcion() {
        return "🧱 Pasillo con escombros por el suelo.";
    }
}
