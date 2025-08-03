package Salas;

public class EnemyRoomLevel4 extends EnemyRoomBase {
    public EnemyRoomLevel4(){
        super("🐜 Hormiga Capitán de Guardia Real ⚔️",70 ,20 );
    }

    @Override
    public String getPasilloDescripcion() {
        return " Estas en un pasillo con diamantes incrustados en las paredes 💎 ";
    }
}
