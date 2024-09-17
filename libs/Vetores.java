package libs;

public class Vetores {
    

public static int[] alocarInteiros(int n){

    int i;
    int[] vetores;
    
    vetores = new int[n];

    for(i = 0; i < vetores.length; i++){
        vetores[i] = 0;
}
    return vetores;
}

public static void mostrar(int[] vetor){

    int i;

    System.out.print("[ ");
    for(i = 0; i < vetor.length; i++){
    System.out.print(vetor[i]);
        if (i < vetor.length - 1) {
            System.out.print(", ");
        }

}
    System.out.println(" ]");

}

public static int[] copiarVetores(int[] v){

   int[] v_novo = Vetores.alocarInteiros(v.length);

    for(int i = 0; i < v.length; i++){
        v_novo[i] = v[i];
    }

    return v_novo;

}

public static void subVetor(int[] v){

int indexA = 0, indexB = 0;
int[] novo_vetor = Vetores.copiarVetores(v);
int i = 0;

    if (indexA < 0) {
        indexA = 0;
    }
    if (indexA >= v.length) {
        indexA = v.length;
    }

    if (indexB < 0) {
        indexB = 0;
    }
    if (indexB >= v.length) {
        indexB = v.length;
    }

    if (indexB <= indexA) {
        System.out.println("[]");
    }

    int tam = indexB - indexA; 

    for(i = 0; i < v.length; i++){
        novo_vetor[indexA] = v[i];
        indexA++;
    }




}



}