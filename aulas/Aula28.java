package aulas;

import libs.Entrada;
import libs.Vetores;

public class Aula28 {
    
    public static void aula(){


        
        System.out.println("-- Aula 28 - 27/09 --");
        ex03();

    }


    public static void ex01(){

        int i = 0, j = 0;

        int [][] n;
        n = new int[5][5];

        for(i = 0; i < n.length; i++){
            for(j = 0; j < n[i].length; j++){ //n na posição i 
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }


    }


    public static void ex02(){
    
    

     int i = 0, j = 0;

        int [][] m;
        m = new int[5][5];


        for(j = 0; j < m[0].length; j++){
            m[0][j] = 1;

        }
        for(j = 0; j < m[0].length; j++){
            m[m[0].length - 1][j] = 1;
        }

        for(i = 0; i < m.length; i++){
            m[i][0] = 1;

        }

        for(i = 0; i < m.length; i++){
            m[i][m[i].length - 1] = 1;
        }

        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    
    
    }

    public static void ex03(){

        int i = 0, j = 0;

        int [][] m;
        m = new int[5][5];

        for(i = 0; i < m.length; i++){
                m[i][i] = 1;
        
        }



        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        
    }


}
