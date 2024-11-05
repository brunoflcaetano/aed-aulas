package aulas;

import java.util.LinkedList;
import java.util.Queue;

public class Aula33 {
    
    public static void aula(){

        ex01();


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




}
