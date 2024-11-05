package aulas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Aula33 {
    
    public static void aula(){

        // ex01();
        ex02();


    }

public static void ex01(){
    Queue<Integer> fila = new LinkedList<>();

    fila.add(15);
    fila.add(20);
    fila.add(50);
    fila.add(-10);
    fila.add(18);

    System.out.println(fila.isEmpty());

    int x = fila.poll();
    System.out.println(x);

    System.out.println("Retirando os elementos ");

    while (! fila.isEmpty()) {
        x = fila.poll();
        System.out.println(x);
    }



    }

public static void ex02(){
    Stack<Integer> pilha = new Stack<>();

    pilha.add(15);
    pilha.add(20);
    pilha.add(50);
    pilha.add(-10);
    pilha.add(18);

    int x; 

    while (! pilha.isEmpty()) {
        x = pilha.pop();
        System.out.println(x);
    }


}


public static double calcularPolonesaReversa(String[] valores){

    int i = 0;
    for(i = 0; i < valores.length; i++){
        if (valores[i] == "+" || valores[i] == "-" || valores[i] =="*" || valores[i] == "/") {
            
        }


    }






    return 0.0;



}


}
