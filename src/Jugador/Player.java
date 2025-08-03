package Jugador;

import Interfaces.GameObject;
import Objetos.Arma;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String nombre;
    private int salud;
    private int ataqueBase;
    private int defensa;
    private Arma armaEquipada;
    private List<GameObject> inventario = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    public Player(String nombre) {
        this.nombre = nombre;
        this.salud = 100;
        this.ataqueBase = 10;
        this.defensa = 5;
        this.inventario = new ArrayList<>();
    }
    //Getters

    public int getSalud() {
        return salud;
    }

    public int getInventarioSize() {
        return inventario.size();
    }

    //Calcula el ataque total sumando el poder del arma equipada
    public int getAtaqueTotal() {
        return ataqueBase + (armaEquipada != null ? armaEquipada.getPoder() : 0);
    }

    // Aplica el daño recibido al jugador considerando la defensa
    public void recibirDaño(int daño) {
        int dañoReducido = Math.max(0, daño - defensa);
        salud -= dañoReducido;
        System.out.println(nombre + "recibió " + dañoReducido + " de daño. Nivel de salud actual:  " + salud);
    }
    //Añadir arma al inventario

    //Restaurar salud del jugador
    public void restaurarSalud(int cantidad) {
        salud = Math.min(100, salud + cantidad);
        System.out.println("💖 Salud restaurada. Salud actual: " + salud);
    }

    //Mostrar el inventario y equipamiento de arma
    public void mostrarInventario() {
        List<Arma> armas = new ArrayList<>();
        for (GameObject objeto : inventario) {
            if (objeto instanceof Arma) {
                armas.add((Arma) objeto);
            }
        }
        if (armas.isEmpty()) {
            System.out.println("No tienes armas en el inventario.");
            return;
        }
        System.out.println("📦 Armas en tu inventario:");
        for (int i = 0; i < armas.size(); i++) {
            System.out.println((i + 1) + ". " + armas.get(i).getNombre());
        }
        System.out.println("¿Que arma quieres equipar? (número o 0 para cancelar)");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        if (opcion == 0) {
            System.out.println("Acción cancelada.");
        } else if (opcion > 0 && opcion <= armas.size()) {
            armaEquipada = armas.get(opcion - 1);
            System.out.println("Has equipado: " + armaEquipada.getNombre());
        } else {
            System.out.println("Opción inválida");
        }
    }

    // Agregar objetos
    public void agregarObjeto(GameObject objeto) {
        inventario.add(objeto);
        System.out.println("Has recogido: " + objeto.getNombre());
    }

    // Buscar objeto
    public GameObject buscarObjeto(String nombre) {
        for (GameObject objeto : inventario) {
            if (objeto.getNombre().equalsIgnoreCase(nombre)) {
                return objeto;
            }
        }
        return null;
    }

    //Eliminar objeto
    public void removerObjeto(GameObject objeto) {
        inventario.remove(objeto);
    }

    //Usar Objeto
    public void usarObjeto(String nombreObjeto) {
        GameObject objeto = buscarObjeto(nombreObjeto);
        if(objeto != null){
        objeto.interactuar(this);
        removerObjeto(objeto); //Una vez se consume
    } else {
        System.out.println("No tienes objetos.");
    }
}
//Guardar arma equipada
    public void setArmaEquipada(Arma arma) {
        this.armaEquipada = arma;
    }

    //Mostrar estado
    @Override
    public String toString() {
          return String.format(
                  "Nombre: %s\nSalud ❤️: %d\nAtaque base 💥: %d\nArma equipada: %s\nDefensa 🛡️: %d\nInventario: %s",
                  nombre,
                  salud,
                  ataqueBase,
                  armaEquipada != null ? armaEquipada.getNombre() : "Ninguna",
                  defensa,
                  inventario.toString()
          );
    }
}









