package Intros_Bases;
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
    public class Instrucciones {
        public static void mostrarInstrucciones() {
            System.out.println("📜 INSTRUCCIONES DEL JUEGO");
            System.out.println("──────────────────────────────");
            System.out.println("🎮 Comandos disponibles:");
            System.out.println("• si → avanzar por el pasillo");
            System.out.println("• no → detenerte (termina el juego)");
            System.out.println("• inventario → revisar tus armas y equipar una");
            System.out.println();
            try {
                Thread.sleep(2000); // Pausa de 2 segundos
            } catch (InterruptedException e) {
                System.out.println("⏱️ Error al pausar la ejecución.");
            }
            System.out.println("🧭 En cada sala puedes encontrar:");
            System.out.println("• Enemigos con habilidades especiales");
            System.out.println("• Tesoros ocultos y objetos mágicos");
            System.out.println("• Armas que puedes recoger y equipar");
            System.out.println();
            try {
                Thread.sleep(3000); // Pausa de 2 segundos
            } catch (InterruptedException e) {
                System.out.println("⏱️ Error al pausar la ejecución.");
            }
            System.out.println("🗡️ Equipar armas:");
            System.out.println("• Al escribir 'inventario', verás una lista numerada de tus armas.");
            System.out.println("• Para equipar una, simplemente escribe el número correspondiente.");
            System.out.println("  Ejemplo: si ves '1. Espada de Fuego', escribe '1' para equiparla.");
            System.out.println();
            try {
                Thread.sleep(3000); // Pausa de 2 segundos
            } catch (InterruptedException e) {
                System.out.println("⏱️ Error al pausar la ejecución.");
            }
            System.out.println("💡 Consejos:");
            System.out.println("• Equipa tus armas antes de entrar en combate.");
            System.out.println("• Algunas salas tienen efectos narrativos o enemigos adaptativos.");
            System.out.println("• Tu salud y defensa afectan cuánto daño recibes.");
            System.out.println();
            System.out.println("✨ ¡Buena suerte, aventurero!");
            System.out.println("──────────────────────────────\n");
            try {
                Thread.sleep(5000); // Pausa de 2 segundos
            } catch (InterruptedException e) {
                System.out.println("⏱️ Error al pausar la ejecución.");
            }
        }
    }
    public void mostrarNarrativa() {
        System.out.println("🌒 Te despiertas en una cámara subterránea, iluminada por cristales \nflotantes que emiten un tenue resplandor azul.");
        System.out.println("Tu cuerpo tiembla, no por frío, \nsino por una energía desconocida que recorre el aire.");
        System.out.println("No recuerdas tu llegada, pero en tu mano hay una antorcha encantada \ny un pergamino sellado con runas antiguas.");
        System.out.println("Solo quienes dominen los Ecos Eternos podrán romper el ciclo.Las salas se reconfiguran,\nlos enemigos absorben recuerdos, y cada decisión altera el flujo del destino.");
        System.out.println("Frente a ti, un corredor serpentea entre pilares rotos y puertas selladas con magia. ");
        System.out.println("Ecos de criaturas olvidadas resuenan en la distancia, \ny artefactos arcanos brillan en rincones que parecen observarte.");
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
