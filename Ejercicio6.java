/**
 * Capítulo 2
 * Ejercicio 6: Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una variable.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio6 {
    public static void main (String[] args) {
        //Pedir la base imponible y calcular el total de la factura
        System.out.println("¿Cuál es el precio sin IVA?");
        int baseimp = 23; // puesto que no sabemos pedir datos todavía, elegí 23 como valor arbitrario
        Double factura = baseimp*1.21;

        // Mostrar por pantalla la factura
        System.out.printf("El total de la factura asciende a %.2f euros", factura);
    }
}
