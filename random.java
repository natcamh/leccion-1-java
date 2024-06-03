
import java.util.Scanner;

/*Crea un programa que, generado un número al azar, el programa realice distintas operaciones según el rango en donde se
encuentra el número. Estos son:
Rango - Operación a Realizar
0 a 20: Mostrar el cuadrado del número
21 a 40: Mostrar la raíz cuadrada del número
41 a 60: Mostrar si el número es par o impar
61 a 80: Intercambiar los dígitos del número
81 a 99: Restar 45 al número. Luego sumar dígitos y mostrar el resultado en texto si el resultado es menor o igual que diez, si
no solo el resultado numérico.

Ejemplos:
Entrada: 17
Salida: El cuadrado de 17 es 289.
Entrada: 36
Salida: La raíz cuadrada de 36 es 6.00.
Entrada: 49
Salida: El número 49 es impar.
Entrada: 69
Salida: El número cambió sus dígitos a 96.
Entrada: 88
Salida: Luego de restar 45 a 88 obtuvimos 43 y sumando sus dígitos tenemos siete.

Nota: Utlice solo operaciones de división, resto, y concatenación para manejar los dígitos del número. No se debe usar ciclos
en este ejercicio. */

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double nro = scanner.nextDouble();
        double nroOriginal = nro;
        if (nro < 20 && nro > -1){
            nro *= nro;
            System.out.println("El cuadrado de " + nroOriginal + "es: " + nro);
        } else if (nro > 20 && nro < 41) {
            nro = Math.sqrt(nro);
            System.out.println("La raíz cuadrada de " + nroOriginal + "es: " + nro);
        } else if (nro > 40 && nro < 59) {
            if (nro % 2 == 0){
                System.out.println("El número " + nroOriginal + "es par.");
            } else {
                System.out.println("El núemro " + nroOriginal + "es impar.");
            }
        } else if (nro > 60 && nro < 79) {
            //Intercambia los digitos del nro teniendo en cuenta que siempre se pasa un nro de 2 cifras.
            double nuevo = 0;
            while(nro > 0){
                double dig = nro % 10;
                nro /= 10;
                nuevo = (dig*10)+ nro;
            }
            System.out.println("El nuevo nro es: " + nuevo);
        } else if (nro > 80 && nro < 100) {
            nro -= 45;
            double nuevo = 0;
            while (nro > 0){
                double dig = nro % 10;
                nro /= 10;
                nuevo = dig + nro;
            }
            if (nuevo <= 10){
                System.out.println("El resultado es menor o igual a diez.");
            } else {
                System.out.println(nuevo);
            }
        }
    }
}