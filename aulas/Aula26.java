package aulas;

import libs.Entrada;
import libs.Vetores;

public class Aula26 {

public static void aula(){

    System.out.println(" ");
    int[] vet;

    vet = Vetores.alocarInteiros(5);

    Vetores.mostrar(vet);

}

public static void exemploVetor(){
    int[]v = {0, 0, 0};

    System.out.println(v[1]);
    modificaVetor(v);
    System.out.println(v[1]);

    int var;
    var = 0;

    System.out.println(var);
    modificaVariavel(var);
    System.out.println(var);

}

public static void modificaVetor(int[] vetor){

    vetor[1] = 5;
}


public static void modificaVariavel(int x){

x = 5;

}



}