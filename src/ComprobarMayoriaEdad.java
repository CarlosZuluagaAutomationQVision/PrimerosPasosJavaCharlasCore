import java.util.Scanner;

public class ComprobarMayoriaEdad {

    //if (condición) -->{
        //true
    //}
        //false
    //else

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese edad: ");

        int edad = entrada.nextInt();

        if(edad < 18){
            System.out.println("Niños");
        }
        else if(edad >=18 && edad<50) {
            System.out.println("Adultas");
        }
        else if(edad>=50)
            System.out.println("Viejitos");
    }

}
