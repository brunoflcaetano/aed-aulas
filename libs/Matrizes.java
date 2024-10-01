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

public static boolean comparar(int[][] mA, int[][] mB){

    int i, j;

    if (mA.length != mB.length) {
        return false;
    }

    if (mA[0].length != mB[0].length) {
        return false;
    }



    for(i = 0; i < mA.length; i++){
        for(j = 0; j < mB.length; j++){
            if (mA[i][j] != mB[i][j]) {
                return false;
            }
        }
    }

   
    return true;


}


    public static int[][] alocarInteiros(int n_linhas, int n_colunas){

        int[][] m;
        m = new int[n_linhas][n_colunas];

        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){ //n na posição i 
                m[i][j] = 0;
            }
        

        }

        return m;
    }



public static String[][] alocarString(int n_linhas, int n_colunas){

    String[][] m;
    m = new String[n_linhas][n_colunas];

    int i, j;
    for(i = 0; i < m.length; i++){
        for(j = 0; j < m[i].length; j++){ //n na posição i 
            m[i][j] = " ";
        }
    

    }

    return m;
}




public static float[][] alocarFloat(int n_linhas, int n_colunas){

    float[][] m;
    m = new float[n_linhas][n_colunas];

    int i, j;
    for(i = 0; i < m.length; i++){
        for(j = 0; j < m[i].length; j++){ //n na posição i 
            m[i][j] = 0;
        }
    

    }

    return m;
}

// fazer ex 11, 13, 14, 17, 23 

    public static int[][] preencherInteiros(int[][] m, int n){

        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                m[i][j] = n;
            }
        
        }

        return m;

    }

    public static String[][] preencherString(String[][] m, String n){

        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                m[i][j] = n;
            }
        
        }

        return m;

    }

    public static float[][] preencherFloat(float[][] m, float n){

        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                m[i][j] = n;
            }
        
        }

        return m;

    }

public static int[][] leiaInteiros(int[][] m){

    int i, j;

    Entrada.abrir();
    System.out.println("Valores: ");
    for(i = 0; i < m.length; i++){
        for(j = 0; j < m[i].length; j++){
            m[i][j] = Entrada.lerInt();
        }
    }
    Entrada.fechar();

    return m;

}


public static int[][] getLinha(int[][] m, int linha){


    int i;

    for(i = linha; i < m.length; i++){
        System.out.println(m[i][0]);
    }

return m;

}



}


