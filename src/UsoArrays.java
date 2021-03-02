public class UsoArrays {

  public static void main(String [] args){

      int[] arrayEnteros  = new int[5];

    arrayEnteros[0] = 5;
    arrayEnteros[1] = -10;
    arrayEnteros[2] = 8;
    arrayEnteros[3] = -25;
    arrayEnteros[4] = 5;

    int[] arrayEnteros2 = {5, -10, 8, -25, 5};

      for(int i=0; i<arrayEnteros2.length; i++){
          System.out.println(arrayEnteros[i]);
      }

     for (int elementos : arrayEnteros2) {
         System.out.println(elementos);
     }

  }

}
