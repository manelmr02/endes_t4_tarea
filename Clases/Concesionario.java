import java.util.ArrayList;

/**
 * Clase Concesionario.
 * Clase que crea objetos Concesionario que representan a un concesionario.
 * @author JoseManuel
 * @version 0.1, 2024/02/20
 */
public class Concesionario {

    /**
     *  Lista de coches.
     *  Lista de objetos de tipo Auto(que representan a coches) para utilizar en el concesionario.
     */
    private ArrayList<Auto> autos;

    /**
     * Contructor de objetos de la clase Cuestionario.
     * El constructor no contiene parámetros porque crea una lista por defecto vacía.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Método agregarAuto.
     * Método que permite añadir un coche a la lista del concesionario.
     * @param auto coche que se va a añadir a la lista del concesionario
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Método listarAutos.
     * Método que devuelve la lista de coches que posee el concesionario.
     * @return Una ArrayList de coches que posee el concesionario
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Método imprimirAutos.
     * Método que permite imprimir por pantalla todos los coches que posee la lista uno por uno.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}