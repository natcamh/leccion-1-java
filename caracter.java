
import java.util.Scanner;

/*Escribe un programa que pida al usuario ingresar un carácter y determinar si es una vocal o una consonante. */
public class caracter {
    public void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese una caracter: ");
        String caracter = scanner.nextLine();
        if ( "a".equals(caracter) 
        || "e".equals(caracter) 
        || "i".equals(caracter) 
        || "o".equals(caracter) 
        || "u".equals(caracter)){
            System.out.println(caracter + " es vocal.");
        } else {
            System.out.println(caracter + "es consonante.");
        }
    }
}
