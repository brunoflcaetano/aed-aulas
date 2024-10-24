import aulas.*;
import libs.Entrada;
import trabalhos.*;
import libs.Matrizes;

 public class Main{




public static void main(String[] args) {
    System.out.println("-- Algoritmos e Estruturas de Dados --");

    // Aula28.aula();

    // Bim2R1.trabalho();

    // Aula29.aula();

    // Aula30.aula();

    // Aula31.aula();

    // Bim2R3.rec();

    // T3.trabalho();

    int[][] matrizA = {{1, 2,}, {3, 4}};
    int[][] matrizB = {{5, 6,}, {7, 8}};

    int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] resultado = multiplicaçaoMatrizes(matrizB, matrizA);


    for (int i = 0; i < resultado.length; i++) {
        for (int j = 0; j < resultado[i].length; j++) {
            System.out.print(resultado[i][j] + " ");
        }
        System.out.println(); 
    }
}



public static int[][] multiplicaçaoMatrizes(int m1[][], int m2[][]){


    int linha1 = m1.length;
    int coluna1 = m1[0].length;
    int coluna2 = m2[0].length;
    
    int[][] resultado;
    resultado = new int[linha1][coluna2];
    
    for(int i = 0; i < m1.length; i++){
        for(int j = 0; j < m2[0].length; j++){
            for(int k = 0; k < m2.length; k++){
                resultado[i][j] += m1[i][k] * m2[k][j];
    
    
    
            }
        }
    }
    
    return resultado;
    
    
    
}
 }


 

