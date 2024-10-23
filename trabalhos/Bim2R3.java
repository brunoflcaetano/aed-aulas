package trabalhos;

public class Bim2R3 {
    
    public static void rec(){

    
    somaCubos();

    }

    public static void somaCubos(){


        String valor_str;
        int valor = 153;

        valor_str = Integer.toString(valor);

       double valor1 = Math.pow(valor_str.charAt(0), 3);
       double valor2 = Math.pow(valor_str.charAt(1), 3);
       double valor3 = Math.pow(valor_str.charAt(2), 3);

    double vt = valor1 + valor2 + valor3;

    if (vt == valor) {
        System.out.println("correto " + vt + " valor original " + valor);
    }
    else{
        System.out.println("incorreto");
    }

    }


}
