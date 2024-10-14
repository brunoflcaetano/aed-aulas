import aulas.*;
import libs.Entrada;
import trabalhos.*;


 public class Main{




public static void main(String[] args) {
    System.out.println("-- Algoritmos e Estruturas de Dados --");

    // Aula28.aula();

    // Bim2R1.trabalho();

    // Aula29.aula();

    // Aula30.aula();

    // Aula31.aula();

    // T3.trabalho();

  

    int[] v = {1, 2, 3, 4};
    int[] w = {5, 6, 7, 8};


vetorUniao(v, w);


}

public static int[] vetorUniao(int[] v, int[] w){

    int i;
    int j;
    int cont = 0;
    
    int tamanhoV = v.length;
    int tamanhoW = w.length;
    int tamanhoT = tamanhoV + tamanhoW;
    
    int[] uniao;
    uniao = new int[tamanhoT]; 
    
    for(i = 0; i < v.length; i++){
        uniao[i] = v[i];

    }

    int index = v.length;

    for(j = 0; j < w.length; j++){
        boolean existe = false;

        for(int k = 0; k < index; k++){
            if(w[j] == uniao[index]){
                existe = true;
                break;
            }

        }
        if (!existe) {
            uniao[index] = w[j];
            index++;
        }

    }
    
   

    return uniao;
    
    
    }

}




