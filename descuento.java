/*Ejercicio a presentar sobre la primera lección.

Escribe un programa que calcule el descuento que se aplicará a un descuento en base a su código y la edad del cliente. El programa tiene las siguientes condiciones:

El usuario ingresa el precio original del producto. -> scanner
El usuario ingresa el código del producto. Los códigos tienen 8 dígitos, y nos interesa saber si el código comienza con los números 37, 16 o 29. -> switch
Si comienza con 37, el producto recibe un 12% de descuento.
Si comienza con 16, el producto recibe un 15% de descuento.
Si comienza con 29, el producto recibe un 19% de descuento.
Para cualquier otro código, no se aplica ningún descuento.
El usuario ingresa su edad. -> scanner
switch:
Si tiene 60 años o más, recibe un descuento adicional del 15%.
Si tiene entre 30 y 59 años, recibe un descuento adicional del 10%.
En caso contrario no recibe ningún descuento por edad.
El descuento máximo que se puede aplicar es del 30%, independientemente de la combinación de descuentos. -> while o if
El programa debe calcular y mostrar el precio final del producto después de aplicar el descuento calculado. -> variable precioFinal
Detalles:
Usar únicamente datos primitivos y String (de considerar necesario).
Se puede utilizar estructuras de control if-else, switch, while, for.
No se permiten colecciones, arreglos, ni clases adicionales.
No se permite el uso de funciones/métodos para modularizar el programa.
Ejemplo de Salida
Ingrese el precio original del producto: 100.0

Ingrese el código del producto (8 dígitos): 37349587

Ingrese la edad del cliente: 25

El precio final con el descuento aplicado es: $88.00

*/

import java.util.Scanner;

public class descuento{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int descCod = 1;
        int descEdad = 1;
        System.out.println("Ingrese precio original del producto: ");
        double precio = scanner.nextDouble();
        double precioOrignal = precio;
        System.out.println("Ingrese el código del producto: ");
        int codigo = scanner.nextInt();

        //Calcular precio con descuento segun codigo

        if (codigo > 36999999 && codigo < 37999999) { 
            precio -= (precio * 12)/100; 
            descCod = 12;
        } else if (codigo > 15999999 && codigo < 16999999 ) {
           precio -= (precio * 15)/100;
           descCod = 15;
        } else if (codigo < 28999999 && codigo > 2999999){
            precio -= (precio * 19)/100;
            descCod = 19;
        }

        // Calcular precio con descuento según edad
        
        System.out.println("Ingrese la edad del cliente: ");
        int edad = scanner.nextInt();

        if (edad > 59){
            precio -= (precio * 15)/ 100;   
            descEdad = 15;
        } else if (39 < edad && edad < 59) {
            precio -= (precio * 10)/ 100;
            descEdad = 10;
        } 

        //Validar que el descuento no sea mayor a 30%

        if (descCod + descEdad >= 30 ){
            precio -= (precioOrignal * 30)/ 100;
        }

        //Mostrar el precio final del producto aplicando los decuentos: 

        System.out.println("El precio final es: "+ precio);
    }
}
