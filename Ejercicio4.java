/**
 * Capítulo 2
 * Ejercicio 4: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio4 {
    public static void main (String[] args) {

        //Pedir los euros
        System.out.println("¿Cuántos euros quiere convertir a pesetas?");
        Double euros = 15.0; //puesto que no sabemos pedir datos todavía, elegí 15 como valor arbitrario
        Double pesetas = euros*166.3860;

        // Mostrar por pantalla la conversión a pesetas
        System.out.printf("%.1f euros equivalen a %.2f pesetas", euros, pesetas);

    }
}
