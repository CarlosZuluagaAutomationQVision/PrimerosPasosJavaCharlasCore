public class DeclaracionOperadores {

    public static void main(String args[]) {
        byte a = 5;
        byte b;
        b = 7;

        int c = b + a;

        System.out.println("La suma es igual a: " + c);

        c -= 2;

        System.out.println("La resta es igual a: " + c);

        double d = 10;
        double e = 5;

        double f = d / e;

        System.out.println("La Division es igual a: " + f);

        final double EQUIVALENCIAMETROSCENTIMETROS = 100.0;

        double cantidadMetros = 528.5;

        double convertirMetrosCentimetros = cantidadMetros / EQUIVALENCIAMETROSCENTIMETROS;

        //EQUIVALENCIAMETROSCENTIMETROS = 102; -- No se puede cambiar la Constante.

        System.out.println("\nEn: " + cantidadMetros + " metros hay: " + convertirMetrosCentimetros + " cm");

    }

}
