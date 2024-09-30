package libs;

public class Matrizes {

    public static int[][] somar(int[][] mA, int[][] mB){

        int[][] mC;
        mC = new int[mA.length][mA[0].length];
        

        int i, j;
        for(i = 0; i < mA.length; i++){
            for(j = 0; j < mB.length; j++){
            
                mC[i][j] = mA[i][j] + mB[i][j];

            }
        }



        return mC;

    }

    public static int[][] novaIdentidade(int n){


        int i = 0, j = 0;

        int [][] m;
        m = new int[n][n];

        for(i = 0; i < n; i++){
                m[i][i] = 1;
        
        }



        return m;

    }



    public static void mostrar(int[][] m){

        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){ //n na posição i 
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
    }
}





}

