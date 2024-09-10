package libs;

import java.util.Scanner;

public class Entrada {
    
    public static Scanner entrada;

    public static void abrir(){
        entrada = new Scanner(System.in);    
    }

    public static void fechar(){
        entrada.close();
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }               

    public static int lerInt(){
        return entrada.nextInt();
    }


    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }               


    public static double lerDouble(){
        return entrada.nextDouble();
    }

   
    public static double lerDouble(String mensagem){
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public static String lerPalavra(){
        return entrada.nextLine();
    }

}