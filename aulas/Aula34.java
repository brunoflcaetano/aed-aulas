package aulas;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Aula34 {
    
    public static void aula(){

    ex02();



    }

    public static void ex01(){

    int i = 0, x = 0;


    LinkedList<Integer> lista = new LinkedList<>();;

    lista.add(10);
    lista.add(20);
    lista.add(30);
    lista.add(40);
    lista.add(50);
    lista.add(60);

    for ( i = 0; i < lista.size(); i++) {
    x = lista.get(i);
    System.out.printf("[%d] %d\n", i, x);

}
    System.out.println("----");
    lista.add(3, 500);
    lista.set(5, 400);


    for ( i = 0; i < lista.size(); i++) {
        x = lista.get(i);
        System.out.printf("[%d] %d\n", i, x);
    
    }

    System.out.println("----");
    for(int y : lista){
        System.out.println(y);
    }

    System.out.println("----");
    ListIterator<Integer> l = lista.listIterator();
    
    System.out.println(l.next());
    System.out.println(l.next());
    

    while(l.hasNext()){
        System.out.println(l.next());
    }




}



public static void ex02(){
        
    Set<Integer> conjunto = new HashSet<>();
    conjunto.add(10);
    conjunto.add(20);
    conjunto.add(30);
    conjunto.add(40);
    conjunto.add(50);
    conjunto.add(40);


    for(int y : conjunto){
        System.out.println(y);
    }

    System.out.printf("Elemento 30 está no conjunto? %b\n", conjunto.contains(30));
    System.out.printf("Elemento 70 está no conjunto? %b\n", conjunto.contains(70));
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
