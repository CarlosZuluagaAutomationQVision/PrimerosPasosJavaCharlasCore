import javax.swing.*;
import java.util.Scanner;

public class CalcularAreaTipoFigura {

    //Cuadrado =! Rectangulo =! Triangulo =! Circunferencia =! Rombo

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1.Cuadrado \n2.Rectángulo \n3.Triángulo \n4.Circunferencia");

        int figuraSeleccionada = entrada.nextInt();
        int base;
        int altura;
        int lado;
        int radio;

        switch (figuraSeleccionada){
            case 1:
                lado = Integer.parseInt(JOptionPane.showInputDialog("Valor del lado cuadrado: "));
                System.out.println("el área del cuadrado es: " +Math.pow(lado, 2));
                break;
            case 2:
                base = Integer.parseInt(JOptionPane.showInputDialog("Valor de la base: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Valor de la altura: "));
                System.out.println("el área del Rectángulo es: " +base*altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Valor de la base: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Valor de la altura: "));
                System.out.println("el área del Triángulo es: " + (base*altura)/2);
                break;
            case 4:
                radio = Integer.parseInt(JOptionPane.showInputDialog("Valor del radio: "));
                System.out.println("el área de la Circunferencia es: " + Math.PI * (Math.pow(radio, 2)));
                break;

            default:
                System.out.println("La opción seleccionada no es correcta");
        }

    }
}
