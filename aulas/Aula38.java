package aulas;

import libs.Vetores;

public class Aula38 {
    
    public static void aula(){



    ex01();


    }


    public static void ex01(){
    
          int[] v0 = {27, 19, 21, 12, 92, 71, 5, 1989};
        System.out.println("Entrada");
        Vetores.mostrar(v0);
        
        System.out.println("Saida");
        
        int[] v_ordenado = Vetores.radixSort(v0);
        Vetores.mostrar(v_ordenado);
    
    
    
    
    }

}
