/**
 * Capítulo 2
 * Ejercicio 8: Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores
 * 5 variables. Por último, muestra la cadena de caracteres por pantalla ¿Qué problemas te encuentras?
 * ¿cómo lo has solucionado?
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio8 {
    public static void main (String[] args) {
        // Declaramos las variables
        char letra1 = 'g';
        char letra2 = 'a';
        char letra3 = 't';
        char letra4 = 'o';
        char letra5 = 's';
        /**
         * Intentamos crear una variable que sea la concatenación de los caracteres:
         *         String palabra = letra1 + letra2 + letra3 + letra4 + letra5;
         * No funciona, porque en realidad se están sumando los códigos ASCII de cada letra, por lo que no es
         * compatible con una variable tipo string. Si probamos a imprimir:
         */
         System.out.println(letra1 + letra2 + letra3 + letra4 + letra5);
         /**
         * Imprime un número entero, la suma de los códigos. Para solucionarlo y poder mostrarlo por pantalla debemos
         * concatenar al principio la cadena vacía.
         */
        System.out.println("" + letra1 + letra2 + letra3 + letra4 + letra5);
    }
}
