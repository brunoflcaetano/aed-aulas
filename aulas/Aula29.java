package aulas;
import libs.Matrizes;

public class Aula29 {

    public static void aula(){

        ex01();

    }
 
    public static void ex01(){


        int[][] m1, m2, m3;
        int n_linhas = 2;
        int n_colunas = 2;

        m1 = new int[n_linhas][n_colunas];
        m2 = new int[n_linhas][n_colunas];

        m1[0][0] = 7;
        m1[0][1] = 20;
        m1[1][0] = 18;
        m1[1][1] = 9;


        m2[0][0] = 14;
        m2[0][1] = 13;
        m2[1][0] = 6;
        m2[1][1] = -5;

        m3 = Matrizes.somar(m1, m2);

       Matrizes.getLinha(m3, n_linhas);



    }




    public static void ex02(){

        int[][] m1;
        int n = 87;

    
        m1 = Matrizes.novaIdentidade(n);

        Matrizes.mostrar(m1);



    }


    public static void ex03(){

        int[][] m1, m2;
        int n_linhas = 2;
        int n_colunas = 2;

        m1 = new int[n_linhas][n_colunas];
        m2 = new int[n_linhas][n_colunas];

        m1[0][0] = 7;
        m1[0][1] = 20;
        m1[1][0] = 18;
        m1[1][1] = 9;


        m2[0][0] = 14;
        m2[0][1] = 13;
        m2[1][0] = 6;
        m2[1][1] = -5;

       if (Matrizes.comparar(m1, m2)) {
        System.out.println("Matrizes Iguais!");
       }
       else{
        System.out.println("Matrizes Diferentes!");
       }
        


    }

}
