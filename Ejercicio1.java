/**
 * Capítulo 2
 * Ejercicio 1: Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio1 {
    public static void main (String[] args) {
        //definición de variables
        int x = 144;
        int y = 999;

        //mostrar por pantalla
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y) );
        System.out.println("x - y = " + (x - y) );
        System.out.println("y - x = " + (y - x) );
        System.out.println("x × y = " + (x * y) );
        System.out.println("x / y = " + ((float)x / y) );
        System.out.println("y / x = " + ((float) y / x) );
    }
}
