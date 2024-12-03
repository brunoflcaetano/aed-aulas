package trabalhos;

import libs.Tempo;
import libs.Vetores;

public class T4 {
    
    public static void trabalho(){
        
        Tempo.medirTempoIniciar();
        bubbleSort1();


    }


    public static void bubbleSort1(){

        
        int[] valores = Vetores.gerarValoresAleatorios(1000, 1,1000);
        System.out.println("Entrada: ");
        Vetores.mostrar(valores);

        System.out.println("Saida");
        Vetores.bubbleSort(valores);
        int[] v_ordenado = valores;
        Vetores.mostrar(v_ordenado);

    }

    // public static void Insertion(){

    //     int[] valores = Vetores.gerarValoresAleatorios(10000, 1,10000);
    //     System.out.println("Entrada: ");
    //     Vetores.mostrar(valores);

    //     System.out.println("Saida");
    //     int[] v_ordenado = Vetores.insertionSort(valores);
    //     Vetores.mostrar(v_ordenado);

    // }



}
