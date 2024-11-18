package aulas;

import java.util.Hashtable;

public class Aula35 {

    public static void aula(){



    // ex01();


    // ex02();

        ex03();



    }


    public static void ex01(){

    System.out.println("++ Ex01: Hashtable ++");    

        Hashtable<String, Integer> tabela = new Hashtable<>();

        tabela.put("batata", 10);
        tabela.put("carne", 15);
        tabela.put("abacate", 3);

        // int qtde_carne = tabela.get("carne");

        // System.out.println("Carne: " + qtde_carne);

        for(String posicao : tabela.keySet()){
            System.out.printf("[%s] %d\n ", posicao, tabela.get(posicao));
        }




    }


    public static void ex02(){

        System.out.println("++ Ex02: Strings ++");    

        String msg = "hoje e um dia apos ontem hoje tambem e um dia antes de amanha hoje nao e ontem nem amanha ";

        String[] palavras = msg.split(" ");
        int i;
        String palavra;

        Hashtable<String, Integer> contador = new Hashtable<>();

        for(i = 0; i < palavras.length; i++){
            
            palavra = palavras[i];

            if (contador.containsKey(palavra)) {
                contador.put(palavra, contador.get(palavra)+1);

            }
            
            else{
                contador.put(palavra, 1);
            }

            }

            for(String posicao : contador.keySet()){
                System.out.printf("[%s]\t%d\n", posicao, contador.get(posicao));
            }


        }


    public static void ex03(){

        System.out.println("++ Ex03: Vetor Esparso ++");

        int[] vetor = {0, 0, 0, 0, 0, 50, 60, 0, 0, 0, 0, 0, 90, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20};
        int i;

        Hashtable<Integer, Integer> vetor_esparso = new Hashtable<>();

        for(i = 0; i < vetor.length; i++){
            if (vetor[i] != 0) {
                vetor_esparso.put(i, vetor[i]);
            }
        }

        for(i = 0; i < vetor.length; i++){
            System.err.printf("[%d] - %d - %d\n ", i, vetor[i], vetorEsparso(vetor_esparso, i));

        }



    }

    public static int vetorEsparso(Hashtable<Integer, Integer> vetor_esparso, int posicao){

        if (vetor_esparso.containsKey(posicao)) {
            return vetor_esparso.get(posicao);
        }
        return 0;
    
    }
        


    }




