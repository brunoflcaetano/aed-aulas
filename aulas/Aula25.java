package aulas;

import java.util.Arrays;

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
    for(i = 0; i < n; i++){
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

    public static void paresDepoisImparesPorUltimo(){

        int i = 0;
        int n = 10;
        int[] va, vb;
        int indexAnterior = n - 1;
    
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
        if (va[i] % 2 == 0) {
            vb[indexAnterior] = va[i];
            indexAnterior--;
        }
       }
    
        System.out.println("[ ");
        for(i = 0; i < n; i++){
            System.out.println(vb[i] + " ");
        }
        System.out.println(" ]");
    
    
        }




        public static void qtdParesEImpares(){

            //ex7

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
                System.out.println("[ ");
                for(i = 0; i < index; i++){
                    System.out.println(vPares[i] + " ]");
                }

                System.out.println("Impares: " + indexImpares);
                System.out.println("[ ");
                for(i = 0; i < index; i++){
                    System.out.println(vImpares[i] + " ]");
                }


        }


}




