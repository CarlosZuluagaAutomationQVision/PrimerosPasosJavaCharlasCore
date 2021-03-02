import javax.swing.*;

public class CalculoFactorial {

    public static void main(String [] args){

        int resultado = 1;
        int numeroFactorial = Integer.parseInt(JOptionPane.showInputDialog("Factorial de:"));

        for(int i=numeroFactorial; i>0; i--){
            resultado = resultado*i;
        }
        System.out.println(resultado);
    }
}
