import java.util.Scanner;
/*Escriba un programa que solicite al usuario su edad y su salario anual. El programa debe evaluar si el usuario es elegible para un aumento "de sueldo y, en caso afirmativo, calcular la cantidad del aumento y mostrarla en la pantalla.
El programa debe evaluar los siguientes criterios para determinar si el usuarix es elegible para un aumento de sueldo:
● Si el usuario tiene al menos 30 años y su salario anual es menor o igual a 50.000 pesos, tiene derecho a un aumento del 10%.
● Si el usuario tiene al menos 25 años y su salario anual es menor o igual a 40.000 pesos, tiene derecho a un aumento del 5%.
● Si el usuario tiene al menos 20 años y su salario anual es menor o igual a 30.000 pesos, tiene derecho a un aumento del 2%.
Si el usuario no cumple con ninguno de los criterios anteriores, el programa debe indicar que no es elegible para un aumento de sueldo en este momento. El programa debe utilizar la estructura if/else y la función println para crear una cadena de texto personalizada que indique si el usuario es elegible para un aumento de sueldo y, en caso afirmativo, la cantidad del aumento.
Muestre el resultado con 2 dígitos. */
public class aumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean recibeAumento = false;
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.err.println("Ingrese su sueldo anual: ");
        double sueldoAnual = scanner.nextDouble();
        double aumento = 0;
        if (edad >= 20 && sueldoAnual <= 30000) {
            aumento = sueldoAnual*2/100;
            recibeAumento = true;
        } else if (edad >= 25 && sueldoAnual <= 40000) {
            aumento = sueldoAnual*5/100;
            recibeAumento = true;
        } else if (edad >= 30 && sueldoAnual <= 50000){
            aumento = sueldoAnual*10/100;
            recibeAumento = true;
        } 

        if (recibeAumento = true){
            System.out.println("Usted es elegible para un aumento de sueldo. Su aumento es: " + aumento);
        } else {
            System.out.println("Usted no es elegible para un aumento de sueldo.");
        }
}
}



