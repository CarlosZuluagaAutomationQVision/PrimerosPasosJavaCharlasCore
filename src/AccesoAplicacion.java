import javax.swing.*;

public class AccesoAplicacion {

    public static void main(String[] args) {

        String claveCorrecta = "123";
        String claveIngresada = "123";

        int contadorIntentos = 0;

        //     while(!claveCorrecta.equals(claveIngresada) && contadorIntentos<3){
        //         claveIngresada = JOptionPane.showInputDialog("Introduce la contraseña: ");
        //         contadorIntentos = contadorIntentos+1;
        //         if(!claveCorrecta.equals(claveIngresada)){
        //             System.out.println("Contraseña Incorrecta");
        //         }
        //         else System.out.println("Clave Correcta");
        //     }
        //     if(contadorIntentos == 3){
        //         System.out.println("Supero el limite de intentos");
        //     }
        // }

        do {
            claveIngresada = JOptionPane.showInputDialog("Introduce la contraseña: ");
            contadorIntentos = contadorIntentos + 1;
            if (!claveCorrecta.equals(claveIngresada)) {
                System.out.println("Contraseña Incorrecta");
            } else System.out.println("Clave Correcta");
        } while (!claveCorrecta.equals(claveIngresada) && contadorIntentos < 3);
        if (contadorIntentos == 3) {
            System.out.println("Supero el limite de intentos");
        }
    }
}
