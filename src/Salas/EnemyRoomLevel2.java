package Salas;

public class EnemyRoomLevel2 extends EnemyRoomBase{
    public EnemyRoomLevel2(){
        super("🕷️ Arak'nor", 35, 10);
    }

    @Override
    public String getPasilloDescripcion() {
        return "🕸️El pasillo está cubierto de telas de araña";
    }
}
