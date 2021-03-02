public class UtilidadesCadenas {

    public static void main(String[] args) {
        String nombre = "Carlos";
        System.out.println("Mi nombre es: " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

        System.out.println("La ultima letra de mi nombre es " +nombre.charAt(nombre.length()-1) );

        System.out.println("Las primeras 3 letras de mi nombre son: " + nombre.substring(0,3));

        System.out.println("las letras de mi nombre despues de la 4 letra son: " + nombre.substring(4));

        String nombreEstudiante = "Carlos";

        System.out.println(nombre.equals(nombreEstudiante));

        String nombreEstudiante2 = "carlos";

        System.out.println(nombre.equals(nombreEstudiante2));

        System.out.println(nombre.equalsIgnoreCase(nombreEstudiante2));

    }

}
