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

    
    int[] v2 = { 0, 2, 45, 5, 2, 9 };
    char teste = 'x';
    mostrarInteiros(v2, teste);

    // filtrarMaiores(v2, 5);

    int[] resultado = filtrarMaiores(v2, 5);

    System.out.print("[ ");
    for(int i = 0; i < resultado.length; i++){
    System.out.print(resultado[i]);
    if (i < resultado.length - 1) {
    System.out.print(", ");
    }
    }
    System.out.print(" ]");

    // int[][] matrizA = {{1, 8,}, {2, 9}};
    // int[][] matrizB = {{5, 6,}, {3, 0}};

    // int[][] matriz = {{0, 3, 9}, {14, 5, 6}, {4, 6, 9}};

    // int[][] resultado = multiplicaçaoMatrizes(matrizB, matrizA);


    // for (int i = 0; i < resultado.length; i++) {
    //     for (int j = 0; j < resultado[i].length; j++) {
    //         System.out.print(resultado[i][j] + " ");
    //     }
    //     System.out.println(); 
    // }
}


public static void mostrarInteiros(int[] v, char c) {

      
    for (int i = 0; i < v.length; i++) {
        System.out.print(v[i]);
        if (i < v.length - 1) {
            System.out.print(c);
        }
    }
    System.out.println();

}


public static int[] filtrarMaiores(int[] vetor, int n) {

    int j = 0;
    int[] novoVetor;
    novoVetor = new int[vetor.length];

    int i;
    int tamanho = 0;

    for (i = 0; i < vetor.length; i++) {
       if (vetor[i] > n) {
        tamanho++;
       }
}

    novoVetor = new int[tamanho];

    for (i = 0; i < vetor.length; i++) {
           if (vetor[i] > n) {
             novoVetor[j] = vetor[i];
                 j++;
         
           }
    }

    return novoVetor;
}
 }


 

