
/*Crea un programa que genere los primeros 30 números de Fibonacci, no utilice funciones recursivas.*/

public class fibonacci {
    public static void main(String[] args) {
        int primerNro = 0;
        int segundoNro = 1;
        int siguiente;
        System.out.println(primerNro);
        System.out.println(segundoNro);
        for (int i = 0; i < 28; i++) {
            siguiente = primerNro + segundoNro;
            System.out.println(siguiente);
            primerNro = segundoNro;
            segundoNro = siguiente;
        }
    }
}
