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

 




}