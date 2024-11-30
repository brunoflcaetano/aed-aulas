package libs;
import java.util.Random;

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

public static String[] alocarString(int n){

    int i;
    String[] vetores;
    
    vetores = new String[n];

    for(i = 0; i < vetores.length; i++){
        vetores[i] = "";
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


public static int[] LerInteiros(int n){

Entrada.abrir();
int[] valores = alocarInteiros(n);

for(int i = 0; i < n; i++){
    valores[i] = Entrada.lerInt();

}
Entrada.fechar();
return valores;


}


public static String[] LerString(int n){

    Entrada.abrir();
    String[] valores = alocarString(n);
    
    for(int i = 0; i < n; i++){
        valores[i] = Entrada.lerString("");
    
    }
    Entrada.fechar();
    return valores;
    
    
    }
    

    public int obterPosicao(int[] vetor, int pos_inicial, int valor_buscar){

        int i = 0;

        for(i = pos_inicial; i < vetor.length; i++){
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }



    return -1;

}



    public int obterIndice(int[] v, int valor_buscar){
       
        int i = 0;
        int contador;

        for(i = valor_buscar; i < v.length; i++){
            

        }


    
    return 0;

}

public static int buscaSequencial(int[] v, int x){

    for(int i = 0; i < v.length; i++){
        if (v[i] == x) {
            return i;
        }
    }
    return -1;

}


public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
            //   e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }
        
        return vetor;






}

public static int buscaBinaria(int[] v, int valor_buscar){

    int ini, meio, fim;

    ini = 0;
    fim = v.length;

    while (ini <= fim) {
        meio = (ini + fim) / 2;
        if (v[meio] == valor_buscar) {
            return meio;
        }else{
            if (valor_buscar < v[meio]) {
                fim = meio -1;
            }else{
                ini = meio +1;
            }

        }
    } 


    return -1;




}

public static int[] subVetor(int[]v, int ini, int fim){


    int k=0;

    int[] sub_vetor = new int[fim - ini];

    for(int i = ini; i < fim; i++){
        sub_vetor[k] = v[i];
        k++;
    }

    return sub_vetor;

}

public static void troca(int[] v, int i, int j){
    int tmp = v[i];
    v[i] = v[j];
    v[j] = tmp;
}

public static void bubbleSort(int[] v){
    int i, j, n;
    n = v.length;
    for(i=0;i<n;i++){ //percorre de 0 até n-1 (n-1 vezes)
        for(j=1;j<n-i;j++){ //percorre de 1 até n-i
            if(v[j]<v[j-1]){ //verifica se o elem. em j é menor que o elem. em j-1
                troca(v, j, j-1); //caso seja menor, troca os elementos
            }
        }
    }
}

public static void bubbleSortRec(int[] v){
    bubbleSortRec_(v, v.length);
}

public static void bubbleSortRec_(int[] v, int fim){
    int j;
    if(fim>1){
        for(j=1; j <fim; j++){
            if(v[j]<v[j-1]){
                troca(v, j, j-1);
            }
        }
        bubbleSortRec_(v, fim-1);
    }
}

public static void insertionSort(int[] v){
    int i,j;
    for(j=1;j<v.length;j++){
        i=j;
        while(i>0 && v[i] < v[i-1]){
            troca(v, i, i-1);
            i--;
        }
    }
}

public static void insertionSortRec(int[] v){
    insertionSortRec_(v, 1);
}

public static void insertionSortRec_(int[] v, int fim){
    int i = fim;
    if(fim < v.length){
        while(i>0 && v[i]<v[i-1]){
            troca(v,i,i-1);
            i--;
        }
        insertionSortRec_(v, fim +1);
    }
}

public static void selectionSort(int[] v){
    int i, j, menor_val, menor_pos;

    for(i=0;i<v.length-1;i++){
        //procura pelo menor valor
        menor_val = v[i];
        menor_pos = i;
        for(j=i+1;j<v.length;j++){
            if(v[j]<menor_val){
                menor_val = v[j];
                menor_pos = j;
            }
        }
        //troca o elemento em i pelo menor valor
        troca(v, i, menor_pos);
    }
}

public static void selectionSortRec(int[] v){
    selectionSortRec_(v, 0);
}

public static void selectionSortRec_(int[] v, int ini){
    int menor_val, menor_pos, j;
    if(ini < v.length-1){
        //procura pelo menor valor
        menor_val = v[ini];
        menor_pos = ini;
        for(j=ini+1;j<v.length;j++){
            if(v[j]<menor_val){
                menor_val = v[j];
                menor_pos = j;
            }
        }
        //troca o elemento em i pelo menor valor
        troca(v, ini, menor_pos);
        //realiza a chamada recursiva a partir de ini+1,
        // dado que os valores até ini estáo ordenados
        selectionSortRec_(v, ini+1);
    }
}

public static int[] merge(int[] va, int[] vb){

    int[] vc;
    vc = new int[va.length + vb.length];

    int i=0, j=0, k=0;

    while (i < va.length && j < vb.length) {
        if (va[i] < vb[j]) {
            vc[k] = va[i]; 
            i++;
        }else{
            vc[k] = vb[j];
            j++;
        }
        k++;
    }

    while (i < va.length) {
        vc[k] = va[i];
        i++;
        k++;
    }

    while (j < vb.length) {
        vc[k] = vb[j];
        j++;
        k++;
    }

    return vc;

}


    public static int[] mergeSort(int[] v){

        int[] ve_ordenado, vd_ordenado, v_ordenado;
        if (v.length <= 1) {
            return v;
        }

        int[] v_esq, v_dir;
        int meio = v.length/2;
        v_esq = subVetor(v, 0, meio);
        v_dir = subVetor(v, meio, v.length);

        ve_ordenado = mergeSort(v_esq);
        vd_ordenado = mergeSort(v_dir);
        v_ordenado = merge(ve_ordenado, vd_ordenado);

        return v_ordenado;


    }


    public static void quickSort(int[] v){
        quickSortRec(v, 0, v.length - 1);
    }
    

    public static void quickSortRec(int[]v, int ini, int fim){
        if (fim - ini > 1) {
            int pos_pivot = quickSortPartCormen(v, ini, fim);
            quickSortRec(v, ini, pos_pivot-1);
            quickSortRec(v, pos_pivot + 1, fim);
        }


    }



    public static int quickSortPartNaive(int[] v, int ini, int fim){
        int pivot = v[ini]; //primeiro elemento é o pivot
        int[] aux = new int[fim-ini+1];
        int i=ini, j=fim, pos_pivot, k;
        
    
        for(k=ini+1;k<=fim;k++){
            if(v[k] <= pivot){
                aux[i] = v[k]; //valores menores ou iguais são copiados para o início
                i++;
            }else{
                aux[j] = v[k]; //valores maiores são copiados para o final
                j--;
            }
        }
    
        pos_pivot=i; //guarda a posição do pivot
        aux[i] = pivot; //copia o pivot para aux
        //copia os valores de volta ao vetor v
        for(k=ini;k<=fim;k++){
            v[k] = aux[k-ini];
        }
        
    
        return pos_pivot;
    }



    static int quickSortPartCormen(int[] v, int ini, int fim) {
        int pivot = v[fim]; //<- pivô é o último elemento
        int pos_menores = ini - 1; //<- menores ou iguais que o pivô

        for (int i = ini; i < fim; i++) {
            if (v[i] <= pivot) {
                pos_menores++;
                troca(v, pos_menores, i);
            }
        }
        pos_menores++;
        troca(v, pos_menores, fim);
        return pos_menores;
    }




    public static int quickSortPartHoare(int[] v, int ini, int fim){
       
        int j = 0;
        int pivot =  v[ini];
        int idx_esq = ini-1;
        int idx_dir = fim+1;

        while(true){
            do{
                idx_dir--;
            }while(v[idx_dir]<=pivot);
            do{
                idx_esq++;
            }while(v[idx_esq]>=pivot);
            if(idx_esq<j){
                troca(v,idx_esq,idx_dir);
            }else{
                return idx_dir;
            }
        }
    }

    public static int[] coutingSort(int[] v){
        int[] contadores = new int[10];
        int[] contador_acumulado = new int[10];
        int[] resultado = new int[v.length];

        int i, p;
        for(i = 0; i < v.length; i++){
            contadores[v[i]]++;
        }

        for(i = 1; i < contadores.length; i++){
            contador_acumulado[i] = contadores[i - 1] + contador_acumulado[i - 1];

        }

        for(i = 0; i < v.length; i++){
            resultado[contador_acumulado[v[i]]++] = v[i];
            // contador_acumulado[v[i]]++;
        }

        return resultado;

    }

    public static int obterValorPos(int x, int k){

        return ((x % Matematica.potencia(10, k)) / Matematica.potencia(10, k-1));


    }


}

