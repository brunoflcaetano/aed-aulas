package trabalhos;

import libs.Vetores;

public class T3 {

    public static void trabalho() {

        int[] v1 = { 0, 2, 45, 5, 2, 9 };
        int[] v2 = { 0, 5, 32, 66, 2, 10, 21 };

        int[][] matrizA = { { 1, 8, }, { 2, 9 } };
        int[][] matrizB = { { 5, 6, }, { 3, 0 } };
        int[][] matriz = { { 0, 3, 9 }, { 14, 5, 6 } };

       filtrarMaiores(v2, 5);

        int[] resultado = filtrarMaiores(v2, 5);

        System.out.print("[ ");
        for(int i = 0; i < resultado.length; i++){
        System.out.print(resultado[i]);
        if (i < resultado.length - 1) {
        System.out.print(", ");
        }
        }
        System.out.print(" ]");

        // int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // int[][] resultado = matrizPermutacaoLinhas(matrizA, 0, 1);

        // for (int i = 0; i < resultado.length; i++) {
        //     for (int j = 0; j < resultado[i].length; j++) {
        //         System.out.print(resultado[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // filtrarMaiores(vetor, 6);

        // aplicarELogico(null, null)

        // mostrarInteiros(vetor);

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
    

    public static int[] filtrarMenores(int[] vetor, int n) {

      
        int j = 0;
        int[] novoVetor;
        novoVetor = new int[vetor.length];

        int i;
        int tamanho = 0;

        for (i = 0; i < vetor.length; i++) {
           if (vetor[i] < n) {
            tamanho++;
           }
    }

        novoVetor = new int[tamanho];

        for (i = 0; i < vetor.length; i++) {
             if (vetor[i] < n) {
                   novoVetor[j] = vetor[i];
                       j++;
               
             }
        }
    
        return novoVetor;
    }

    

    public static boolean[] aplicarELogico(boolean[] v, boolean[] w) {

        int i;
        int j;
        boolean[] novoVetor;
        novoVetor = new boolean[v.length];

        for (i = 0; i < v.length; i++) {
            novoVetor[i] = v[i] && w[i];

        }

        return novoVetor;
    }

    public static boolean[] aplicarOuLogico(boolean[] v, boolean[] w) {

        int i;
        int j;
        boolean[] novoVetor;
        novoVetor = new boolean[v.length];

        for (i = 0; i < v.length; i++) {
            novoVetor[i] = v[i] || w[i];

        }

        return novoVetor;
    }

    public static int[] aplicarMascara(int[] v, boolean[] mascara) {

        int i;
        int j = 0;
        int existe = 0;

        for (i = 0; i < mascara.length; i++) {
            if (mascara[i] == true) {
                existe++;
            }
        }

        int[] verdade;
        verdade = new int[existe];

        for (i = 0; i < mascara.length; i++) {
            if (mascara[i] == true) {
                verdade[j] = v[i];
                j++;
            }
        }

        return verdade;
    }

    public static int[] uniao(int[] v, int[] w) {

        int i;
        int j;

        int tamanhoV = v.length;
        int tamanhoW = w.length;
        int tamanhoT = tamanhoV + tamanhoW;

        int[] uniao;
        uniao = new int[tamanhoT];

        for (i = 0; i < v.length; i++) {
            uniao[i] = v[i];

        }

        int index = v.length;


        for (j = 0; j < w.length; j++) {
            boolean existe = false;

            for (int k = 0; k < uniao.length; k++) {
                if (w[j] == uniao[k]) {
                    existe = true;
                 break;
                
                } 
            
            }

            if (existe == false) {
                uniao[index] = w[j];
                index++;

        }

        }

        int[] resultado = new int[index];
        for (i = 0; i < index; i++) {
            resultado[i] = uniao[i];
        }
    
        return resultado;
    }



    public static int[] intersecao(int[] v, int[] w) {

        int i;
        int j;
        int k = 0;

        int[] interseção;
        interseção = new int[v.length];

        for (i = 0; i < v.length; i++) {
            for (j = 0; j < w.length; j++) {
                if (v[i] == w[j]) {
                    interseção[k] = v[i];
                    k++;
                }
            }

        }

        return interseção;

    }

    public static int[] diferenca(int[] v, int[] w) {

        int i;
        int j;
        int k = 0;

        int[] diferença;
        diferença = new int[v.length];

        for (i = 0; i < v.length; i++) {
            boolean existe = false;

            for (j = 0; j < w.length; j++) {
                if (v[i] == w[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                diferença[k] = v[i];
                k++;
            }

        }
        
       
    
        return diferença;

    }

    public static int[][] matrizTranspor(int[][] a) {

        int i, j;
        int[][] transposta;
        transposta = new int[a[0].length][a.length];

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {

                transposta[i][j] = a[j][i];

            }

        }

        return transposta;
    }

    public static int[][] matrizPermutacaoLinhas(int[][] m, int indiceA, int indiceB) {

        int[] armaz = new int[m.length];
        // m[indiceA] = m[indiceB];
        // m[indiceB] = armaz;

        for (int i = 0; i < m[0].length; i++) {
            armaz[i] = m[indiceA][i];
        }

        for (int i = 0; i < m[0].length; i++) {
            m[indiceA][i] = m[indiceB][i];
        }
        for (int i = 0; i < m[0].length; i++) {
            m[indiceB][i] = armaz[i];
        }

        return m;

        // teste:
        // int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // int[][] resultado = matrizPermutacaoLinhas(matriz, 1, 2);

        // for (int i = 0; i < resultado.length; i++) {
        // for (int j = 0; j < resultado[i].length; j++) {
        // System.out.print(resultado[i][j] + " ");
        // }
        // System.out.println();
        // }

    }

    public static int[][] matrizMultInt(int m1[][], int m2[][]) {

        int linha1 = m1.length;
        int coluna1 = m1[0].length;
        int coluna2 = m2[0].length;

        int[][] resultado;
        resultado = new int[linha1][coluna2];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];

                }
            }
        }

        return resultado;

    }

}
