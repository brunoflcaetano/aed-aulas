package libs;

public class Matematica {
    
    public static int exMenor(int a, int b){
    
        if(a < b){
           return a;
        }
    return b;       


}

public static int potenciaRecursiva(int x, int y){
    if(y == 0){
        return 1;
    }

    return x * potenciaRecursiva(x, y - 1 );

}

public static int potencia(int x, int y){
    int k = x;

    if (y == 0) {
        return 1;
    }
    
    for(int i = 1; i < y; i++){
        k = k * x;

    }
    return k;
}






}