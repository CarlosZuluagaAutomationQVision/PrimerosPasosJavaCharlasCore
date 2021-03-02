import java.util.Scanner;

public class ValoresEntrada1 {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombreUsuario = entrada.nextLine();

        System.out.println("escribe tu edad: ");
        int edadUsuario = entrada.nextInt();


    }

}
