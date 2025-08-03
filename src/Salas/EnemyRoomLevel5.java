package Salas;

public class EnemyRoomLevel5 extends EnemyRoomBase{
    public EnemyRoomLevel5(){
        super("🐜 Hormiga Quimera Reina 👑", 100, 30);
    }

    @Override
    public String getPasilloDescripcion() {
        return "🚪 Una gran puerta tenebrosa se alza al final del pasillo.";
    }
}
