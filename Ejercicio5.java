/**
 * Capítulo 2
 * Ejercicio 5: Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio5 {
    public static void main (String[] args) {
        //Pedir las pesetas
        System.out.println("¿Cuántos pesetas quiere convertir a euros?");
        Double pesetas = 1500.0; // puesto que no sabemos pedir datos todavía, elegí 1500 como valor arbitrario
        Double euros = pesetas*0.006;

        // Mostrar por pantalla la conversión a euros
        System.out.printf("%.1f pesetas equivalen a %.1f euros", pesetas, euros);
    }
}
