package trabalhos;

public class Bim2R1 {
    
public static void trabalho(){
    System.out.println("-- Trabalho 2º Bimestre - R1 - Recursividade --");


    int a = 4; 
    int b = 2;
   
    System.out.println(restoDivisaoInteira(a, b));
}

public static int restoDivisaoInteira(int a, int b){

    int mod;

    if(b == 0){
        System.out.println("Divisão por zero não é permitida.");
        return -1;
    }

    mod = a / (b * (b * a));



    return mod;
}

}
