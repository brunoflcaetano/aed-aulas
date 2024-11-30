package aulas;

import libs.Vetores;

public class Aula37 {
    public static void aula(){





        ex01();

    }
    

    public static void ex01(){

        int[] v0 = {7, 2, 9, 2, 7, 1, 9, 2, 0};
        System.out.println("Entrada");
        Vetores.mostrar(v0);
        
        System.out.println("Saida");
        int[] v_ordenado = Vetores.coutingSort(v0);
        Vetores.mostrar(v_ordenado);
    
    }










}

