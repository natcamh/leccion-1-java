
import java.util.Scanner;

/* Crea un algoritmo que, dadas 3 notas musicales, identifique el acorde que acaba de crearse. Un acorde es un conjunto de notas que constituye una unidad armónica. El programa debe reconocer los siguientes acordes:
Nota Nota Nota Acorde
C E F Do mayor
D F A Re menor
E G B Mi menor
F A C Fa mayor
G B D Sol mayor
A C E La menor
B D F Si disminuido */

public class acorde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un acorde");
        String acorde = scanner.nextLine();
        switch (acorde) {
            case "CEF" -> System.out.println("El acorde ingresado es Do Mayor");
            case "DFA" -> System.out.println("El acorde ingresado es Re Menor");
            case "EGB" -> System.out.println("El acorde ingresado es Mi Menor");
            case "FAC" -> System.out.println("El acorde ingresado es Fa Mayor");
            case "GBD" -> System.out.println("El acorde ingresado es Sol Mayor");
            case "ACE" -> System.out.println("El acorde ingresado es La Menor");
            case "BDF" -> System.out.println("El acorde ingresado es Si disimulado");
            default -> {System.out.println("El acorde ingresado es incorrecto");}
    } 
}
    
}
