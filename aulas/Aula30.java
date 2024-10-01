package aulas;

import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


public class Aula30 {
    
    public static void aula(){

        System.out.println("++ Aula 30: Arquivos ++");

        ex02();

    }

    public static void ex01(){

        String nome_arquivo = "/tmp/teste.txt";
        int i;

        try{

            FileWriter arquivo = new FileWriter(nome_arquivo);

            // arquivo.write("Algoritmos. \n");

            for(i = 0; i < 100000; i++){
                // arquivo.write(i + " Elefantes incomodam muita gente " + (i+1) + " Incomodam muito mais\n");
                arquivo.write(i + "\n");
            }
            
            arquivo.close();

        }catch(Exception e){
            System.err.println("Erro. ");
            System.err.println(e);

        }

    }
    public static void ex02(){

        String nome_arquivo = "numeros.txt";
       

        try{

            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);



            for(int i = 0; i< 2; i++){
            String nome = entrada.next();
            System.out.println(nome);

            int valor = entrada.nextInt();
            System.out.println(valor);

            }

            
             entrada.close(); 


            
            

        }catch(Exception e){
            System.err.println("Erro. ");
            System.err.println(e);

        }
    }



}
