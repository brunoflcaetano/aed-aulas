package trabalhos;

import libs.Vetores;


public class T3 {
    
    public static void trabalho(){


        int[] v = {1, 2, 3, 4};
        int[] w = {5, 6, 7, 8};


        // filtrarMaiores(vetor, 6);

        // aplicarELogico(null, null)

        // mostrarInteiros(vetor);
      
    }

public static void mostrarInteiros(int[] v){


    System.out.print(" ' ");
    for(int i = 0; i < v.length; i++){
        System.out.print(v[i]);
        if (i < v.length - 1) {
            System.out.print(" x ");
        }
    }
    System.out.println(" ' ");


}

public static int[] filtrarMaiores(int[] vetor, int n){

    int[] novoVetor;
    novoVetor = new int[vetor.length];

    int i;

    for(i = 0; i < vetor.length; i++){
        if (i > n) {
            novoVetor[0] = vetor[i];
           
            System.out.print("[ " + novoVetor[i] + " ] ");
        }
        
    }
    return novoVetor;

    }

 public static int[] filtrarMenores(int[] vetor, int n){

        int[] novoVetor;
        novoVetor = new int[vetor.length];
    
        int i;
    
        for(i = 0; i < vetor.length; i++){
            if (i < n) {
                novoVetor[i] = vetor[i];
               
                System.out.print("[ " + novoVetor[i] + " ] ");
            }
            
        }
        return novoVetor;
    
        }
    
        
public static boolean[] aplicarELogico(boolean[] v, boolean[] w){

    int i;
    int j;
    boolean[] novoVetor;
    novoVetor = new boolean[v.length];

    for(i = 0; i < v.length; i++){
           novoVetor[i] = v[i] && w[i];
            
        
        }



    return novoVetor;
}

public static boolean[] aplicarOuLogico(boolean[] v, boolean[] w){

    int i;
    int j;
    boolean[] novoVetor;
    novoVetor = new boolean[v.length];

    for(i = 0; i < v.length; i++){
           novoVetor[i] = v[i] || w[i];
            
        
        }



    return novoVetor;
}

public static void aplicarMascara(int[] v, boolean[] mascara){


int i;
int j = 0;
int existe = 0;

for(i = 0; i < mascara.length; i++){
    if (mascara[i] == true) {
    existe++;
}
}

int[] verdade;
verdade = new int[existe];

for(i = 0; i < mascara.length; i++){
    if (mascara[i] == true) {
        verdade[j] = v[i];
        j++;
    }
}

mostrarInteiros(verdade);
}


public static int[] vetorUniao(int[] v, int[] w){

    int i;
    int j;
  
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

    

public static int[] vetorInterseção(int[] v, int[] w){


    int i;
    int j;
    int k = 0;

    int[] interseção;
    interseção = new int[v.length];
    
    for(i = 0; i < v.length; i++){
        for(j = 0; j < w.length; j++){
            if (v[i] == w[j]) {
                interseção[k] = v[i];
                k++;
            }
        }
    
    }


    return interseção;

}



public static int[] vetorDiferença(int[] v, int[] w){

    int i;
    int j;
    int k = 0;

    int[] diferença;
    diferença = new int[v.length];

 

    for(i = 0; i < v.length; i++){
        boolean existe = false;


        for(j = 0; j < w.length; j++){
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


}

