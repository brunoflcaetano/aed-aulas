package aulas;

import libs.Vetores;

public class Aula36 {

    public static void aula(){

        ex01();

    }
    

    public static void ex01(){

        int[] v0 = {4, 1, 7, 0, 8, 5, 2, 9, 6, 3};
        System.out.println("Entrada");
        Vetores.mostrar(v0);
        // int meio = v0.length/2;
        // int[] v_esquerda = Vetores.mergeSort(v0);
        // int[] v_dir = Vetores.mergeSort(v0);
        System.out.println("Saida");
        int[] v_ordenado = Vetores.mergeSort(v0);
        Vetores.mostrar(v_ordenado);
  
  
  
    }





}



