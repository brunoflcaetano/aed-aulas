package aulas;

import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Aula31 {
    
    public static void aula(){

        System.out.println("++ Aula 31: Mais arquivos ++");
        ex02();

    }



    public static void ex01(){

        String nome_arquivo = "./arquivos/valores_10.txt";
        int i;
        int soma = 0;
        int valor_lido;
        double media;
    
        try{

            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            for(i = 0; i < 10; i++){
            valor_lido = entrada.nextInt();
            soma = soma + valor_lido;
            }
           
            media = soma / (double) 10;
            System.out.println("Média: " + media);

            entrada.close();

        }catch(Exception e){
            System.err.println("Erro. ");
            System.err.println(e);
        }
    }

    public static void ex02(){

        String nome_arquivo = "./arquivos/valores_n.txt";
        int i;
        double media;
        int soma = 0;
        int quantidade;
        int qtd_total = 0;

        try{

            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            for(i = 0; i < arquivo.length(); i++){
                quantidade = entrada.nextInt();
                qtd_total = quantidade - 1;
                soma = soma + qtd_total;
            }

            media = soma / qtd_total;

            System.out.println("Média: " + media);

            
            entrada.close();

        }catch(Exception e){
            System.err.println("Erro. ");
            System.err.println(e);

        }


    }



}
