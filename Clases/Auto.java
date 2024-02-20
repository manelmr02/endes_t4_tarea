import java.util.ArrayList;

/**
 * Clase Auto.
 * Clase que crea objetos Auto que representan a coches.
 * @author JoseManuel
 * @version 0.1, 2024/02/20
 */
public class Auto {

    /**
     * Marca de un coche.
     * Marca que fabrica un coche.
     */
    private String marca;

    /**
     * Modelo de un coche.
     * Modelo de un coche fabricado por una marca.
     */
    private String modelo;

    /**
     * Constructor de objetos de la clase Auto.
     * El constructor contiene los atributos necesarios.
     * @param marca marca del coche
     * @param modelo modelo del coche
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método getter para marca.
     * Método que devuelve la marca de un coche.
     * @return String con la marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método setter para marca.
     * Método que permite establecer un nuevo valor para el atributo marca del objeto Auto.
     * @param marca nueva marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método getter para modelo.
     * Método que devuelve el modelo de un coche.
     * @return String con el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método setter para modelo.
     * Método que permite establecer un nuevo valor para el atributo modelo del objeto Auto.
     * @param modelo nuevo modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que convierte la estancia de un objeto Auto en un String.
     * El metodo devuelve un string con toda la información necesaria.
     * @return Un string con toda la información necesaria sobre el coche
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}