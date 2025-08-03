package DungeonGame;

import Interfaces.Room;
import Intros_Bases.IntroRoom;
import Jugador.Player;
import Objetos.Amuleto;
import Salas.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Explorar un numero aleatorio de pasillos hasta llegar a uan sala
    public static void explorarHastaSala(Room room, Scanner teclado, Player player){
        Random rand = new Random();
        int pasillosPrevios = rand.nextInt(4) + 1 ;

        // Posibles giros narrativos
        String[] giros = {
                "↩️ Giras a la izquierda. El pasillo se vuelve más angosto.",
                "↪️ Giras a la derecha. Hay una tenue luz verde en las paredes.",
                "⬆️ Sigues recto y sientes que el aire se enfría.",
                "↘️ Tomas una curva descendente. Tus pasos resuenan."
        };

        for (int i = 0; i < pasillosPrevios; i++) {
            System.out.println("Recorres un pasillo oscuro y silencioso...");
            System.out.println(giros[rand.nextInt(giros.length)]);
            //Opción para seguir, revisar y equipar del inventario
            while(true){
            System.out.println("¿Quieres seguir avanzando? (si/no/inventario)");
            String entrada = teclado.nextLine().toLowerCase().trim();

           //Opción para revisar inventario
           if(entrada.equals("inventario")) {
               player.mostrarInventario();
               continue;
            }
            //Opción para avanzar
                if(entrada.equals("si")){
                    break; //salimos del bucle y avanzamos al siguiente paso
                }
                if(entrada.equals("no")){
                    System.out.println("Te detienes en la oscuridad. Fin del juego.");
                    System.exit(0);
                }
                System.out.println("opción no reconocida. Intenta nuevamente");
            }
        }
        //LLegada al pasillo especial y a la sala
        System.out.println("\nAlgo en el ambiente ha cambiado");
        System.out.println(room.getPasilloDescripcion());
        System.out.println("¿Empujar la puerta y entrar? (si/no)");
        String respuesta = teclado.nextLine().toLowerCase().trim();
        if (respuesta.equals("si")) {
            room.entrar(player);
        } else {
            System.out.println("Decides no entrar. Fin del juego");
            System.exit(0);
        }
        // verificar si el jugador ha sido derrotado
        if (player.getSalud()<= 0) {
            System.out.println("Has sido derrotado 💀");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        IntroRoom.Instrucciones.mostrarInstrucciones();
        // Introducción narrativa
        IntroRoom introRoom = new IntroRoom(teclado);
        String nombre = introRoom.iniciarIntroduccion();

        //Crear jugador y comenzar a jugar
        Player player = new Player(nombre);
        System.out.println("\nEstado del jugador:");
        System.out.println(player);
        System.out.println("\nComencemos la aventura!!\n");

        //Lista de salas del recorrido del juego
        List<Room> rooms = new ArrayList<>(List.of(
                new VacuumRoom(),
                new ArsenalRoom(),
                new EnemyRoomLevel1(),
                new TreasureRoom(),
                new ArsenalRoom2(),
                new EnemyRoomLevel3(),
                new EnemyRoomLevel4()
        ));
        //Verificación si el jugador está débil
        if (player.getSalud() <= 60) {
            System.out.println("🌌 El aire se vuelve denso... una sala olvidada se revela entre las sombras.");
            rooms.add(new TreasureRoom2());
        }
        //Sala fianl del jefe
        rooms.add( new EnemyRoomLevel5());
        for (Room room : rooms) {
            explorarHastaSala(room, teclado, player);
        }
            if (player.getSalud()<= 0) {
                System.out.println("Has sido derrotado 💀");
                return;
            }
        System.out.println("\n🎉 ¡Felicidades! Has superado todas las salas.");
        }

    }



