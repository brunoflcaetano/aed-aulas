package aulas;

import libs.Entrada;

public class Aula25 {
    

    public static void aula(){
        System.out.println("--Aula 25--");
    }

    public static void paresDepoisImpares(){

    int i = 0;
    int n = 10;
    int[] va, vb;

    va = new int [n];
    vb = new int [n];

    Entrada.abrir();
    
    System.out.println("valores:");
    for(i = 0; i <= n; i++){
        va[i] = Entrada.lerInt();

    }
    Entrada.fechar();

    int index = 0;
    for(i = 0; i<n; i++){
        if(va[i] % 2 == 0){
        vb[index] = va[i];
        index++;

        }
    }
    for(i = 0; i < n; i++){
     if(va[i] % 2 != 0){
        vb[index] = va[i];
        index++;
     }
    }

    System.out.println("[ ");
    for(i = 0; i < n; i++){
        System.out.println(vb[i] + " ");
    }
    System.out.println(" ]");


    }


    

    public static void Main(String[] args){

        aula();
        paresDepoisImpares();



    }
   




}




