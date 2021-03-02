public class UsoArraysBidimensional {

    public static void main(String[] args) {

        int diagonal1 = 0;
        int diagonal2 = 0;

        int[][] matriz = {       //i,j i,j i,j i,j
                {5, -8, 15, 20}, //0,0 0,1 0,2 0,3
                {10, 4, 9, 15},  //1,0 1,1 1,2 1,3
                {-5, 6, 12, 11}, //2,0 2,1 2,2 1,4
                {-2, 1, 15, 17}  //3,0 3,1 3,2 1,5
        };

        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + "  ");
                if(i == j){
                    diagonal1 = diagonal1 + matriz[i][j];
                }
                if(i+j == (matriz.length-1)){
                    diagonal2 = diagonal2 + matriz[i][j];
                }

            }
        }
        System.out.println("\n resultado diagonal 1: " +diagonal1);
        System.out.println("\n resultado diagonal 2: " +diagonal2);
        if(diagonal1 > diagonal2){
            System.out.println("\nLa mayor es la diagonal1: " +diagonal1);
        }
        else if(diagonal1 < diagonal2) {
            System.out.println("\nLa mayor es la diagonal2: " + diagonal2);
        }
        else System.out.println("Las diagonales son iguales.");
    }

}
