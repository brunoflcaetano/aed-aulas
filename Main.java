import aulas.*;
import libs.Entrada;

public class Main{




public static void main(String[] args) {
    System.out.println("-- Algoritmos e Estruturas de Dados --");
    // Aula24.main(args);
    Aula25.aula();


    int n;
    int[] v, vPares, vImpares;
    int i = 0;
    

    Entrada.abrir();

    System.out.println("Quantos números serão digitados? ");
    n = Entrada.lerInt();

    v = new int [n];
    vPares = new int [n];
    vImpares = new int [n];
   
    System.out.println("Agora digite os valores: ");
    for(i = 0; i < n; i++){
        v[i] = Entrada.lerInt();

    }

    Entrada.fechar();

    int index = 0;
    int indexImpares = 0;

    for(i = 0; i < n; i++){
        if (v[i] % 2 == 0) {
            vPares[index] = v[i];
            index++;
        }
        else{
            vImpares[indexImpares] = v[i];
            indexImpares++;

        }

    
    }

    System.out.println("Pares: " + index);
        System.out.print("[ ");
        for(i = 0; i < index; i++){
            System.out.print(vPares[i] + " ");
        }
        System.out.println(" ]");

        System.out.println("Impares: " + indexImpares);
        System.out.print("[ ");
        for(i = 0; i < index; i++){
            System.out.print(vImpares[i] + " ");
        }
        System.out.print(" ]");


}

}

