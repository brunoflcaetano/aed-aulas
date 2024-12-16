package trabalhos;

import libs.Tempo;
import libs.Vetores;

public class T4 {
    
    public static void trabalho(){
        
    bubbleSort1();
    insertion();
    selection();
    merge();
    quick();
    couting();
    radix();

    }

    public static int[] tamanhoVetor(){

        int [] valores = Vetores.gerarValoresAleatorios(1000000, 1, 1000000);

        return valores;
    }


    public static void bubbleSort1(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.bubbleSort(valores);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo BubbleSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }


    public static void insertion(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.insertionSort(valores);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo InsertionSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }

    public static void selection(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.selectionSort(valores);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo SelectionSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }
 
    
    public static void merge(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.mergeSort(valores);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo mergeSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }

    public static void quick(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.quickSort(valores);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo QuickSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }

    public static void couting(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.coutingSort(valores, 1);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo CoutingSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }

    public static void radix(){
        int[] valores = tamanhoVetor();
        System.out.println("Entrada: ");
        // Vetores.mostrar(valores);
        System.out.println(valores.length);

        
        long tempo_inicio = Tempo.medirTempoIniciar();
        // System.out.println("Saida");
        Vetores.radixSort(valores);
        int[] v_ordenado = valores;
        // Vetores.mostrar(v_ordenado);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        

    
        System.out.printf("Tempo de ordenação com " + valores.length + " elementos, utilizando Algoritmo RadixSort: " + temp_segundos + " segundos ");
        System.out.println();
        System.out.println();
    }


}
