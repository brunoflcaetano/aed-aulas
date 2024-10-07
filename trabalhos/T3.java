package trabalhos;

public class T3 {
    
    public static void trabalho(){


        boolean[] v = {true, true, false, false};
        boolean[] w = {false, true, false, false};


        // filtrarMaiores(vetor, 6);

        // aplicarELogico(null, null)

        // mostrarInteiros(vetor);
        aplicarELogico(v, w);
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
            novoVetor[i] = vetor[i];
           
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
int j;
boolean[] verdade;
verdade = new boolean[mascara.length];


for(j = 0; j < mascara.length; j++){
    if(mascara[j] = true) {
        verdade[j] = mascara[j];
    }
}

for(i = 0; i < v.length; i++){
    if (v[i] == verdade) {
        
    }


}







}



}

