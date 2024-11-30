package libs;

public class Matematica {
    
    public static int exMenor(int a, int b){
    
        if(a < b){
           return a;
        }
    return b;       


}

public static int potenciaRecursiva(int a, int b){
    if(b == 0){
        return 1;
    }

    return a * potenciaRecursiva(a, b-1);
}

public static int potencia(int x, int y){
   
    if (y == 0) {
        return 1;
    }
    
    int k = x;

    for(int i = 0; i < y; i++){
        k = k*x;
    }
    return k;
}

}