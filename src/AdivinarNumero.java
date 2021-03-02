import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

        int contadorIntentos = 0;
        int numeroPrueba = 0;
        int numeroAleatorio = (int) (Math.random() * 100 + 1);
        Scanner entrada = new Scanner(System.in);

    //    while (numeroPrueba != numeroAleatorio && contadorIntentos < 20) {
    //        System.out.println("Introduce un numero: ");
    //        numeroPrueba = entrada.nextInt();
    //        contadorIntentos = contadorIntentos + 1;
    //        if (numeroPrueba < numeroAleatorio) {
    //            System.out.println("Tu número es menor al numero que debes adivinar");
    //        } else if (numeroPrueba > numeroAleatorio) {
    //            System.out.println("Tu número es mayor al numero que debes adivinar");
    //        }
    //    }
    //    if (contadorIntentos == 20) {
    //        System.out.println("GAME OVER! te consumiste todos los intentos");
    //    } else
    //        System.out.println("FELICIDADES! encontraste el valor correcto despues de " + contadorIntentos + " intentos");

        do{
            System.out.println("Introduce un numero: ");
            numeroPrueba = entrada.nextInt();
            contadorIntentos = contadorIntentos + 1;
            if (numeroPrueba < numeroAleatorio) {
                System.out.println("Tu número es menor al numero que debes adivinar");
            } else if (numeroPrueba > numeroAleatorio) {
                System.out.println("Tu número es mayor al numero que debes adivinar");
            }
        }while(numeroPrueba != numeroAleatorio && contadorIntentos < 20);
        if (contadorIntentos == 20) {
            System.out.println("GAME OVER! te consumiste todos los intentos");
        } else
            System.out.println("FELICIDADES! encontraste el valor correcto despues de " + contadorIntentos + " intentos");
    }
}
