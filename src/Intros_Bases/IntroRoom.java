package Introducción;
import java.util.Scanner;

public class IntroRoom {
    private Scanner teclado;

    public IntroRoom(Scanner teclado) {
        this.teclado = teclado;
    }
    public String iniciarIntroduccion(){
        mostrarNarrativa();
        return pedirNombre();
    }
    public void mostrarNarrativa() {
        System.out.println("🌒 Te despiertas en una cámara subterránea, iluminada por cristales flotantes que emiten un tenue resplandor azul.");
        System.out.println("\nTu cuerpo tiembla, no por frío, sino por una energía desconocida que recorre el aire.");
        System.out.println("\nNo recuerdas tu llegada, pero en tu mano hay una antorcha encantada y un pergamino sellado con runas antiguas.");
        System.out.println("\nSolo quienes dominen los Ecos Eternos podrán romper el ciclo.Las salas se reconfiguran, los enemigos absorben recuerdos, y cada decisión altera el flujo del destino.");
        System.out.println("\nFrente a ti, un corredor serpentea entre pilares rotos y puertas selladas con magia. ");
        System.out.println("\nEcos de criaturas olvidadas resuenan en la distancia, y artefactos arcanos brillan en rincones que parecen observarte.");
        System.out.println("🗝️ Prepárate. Aquí, incluso el tiempo puede volverse tu enemigo.");
        System.out.println();
    }
    private String pedirNombre() {
        System.out.println("\nTu nombre... ¿lo recuerdas?");
        return teclado.nextLine().trim();
    }
    private void pausar() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
