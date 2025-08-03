package Salas;

public class EnemyRoomLevel3 extends EnemyRoomBase {
    public EnemyRoomLevel3(){
        super("🐍 Serpiente demoniaca",50, 15);
    }

    @Override
    public String getPasilloDescripcion() {
        return "🐍 Escamas brillantes cubren el suelo de este pasillo";
    }
}
