package aulas;

public class Aula24 {


public static void mostrarMaioresQueMedia(){

int[] valores;

double media, soma = 0;
int n_valores = 8;

valores = new int[n_valores];

Entrada.abrir();
for(int i = 0; i < valores.length; i++){
    valores[i] = Entrada.lerInt();

}
Entrada.fechar();

for(int i = 0; i < valores.length; i++){
    soma += valores[i];

    
}

media = soma/n_valores;

for(int i = 0; i < valores.length; i++){
if (valores[i] > media) {
    n_valores++;
}

}





}



public static void vetorC(){

int [] c;

int n_valores = 10;

c = new int[n_valores];

System.out.print(" ");

for(int i = 0; i < c.length; i++){
    if (c[i] < 0) {
        c[i] = 0;

    System.out.print(c[i] + " ");

    }

}




}




public static void main(String[] args) {
    
System.out.println("++ Vetores ++");
// mostrarMaioresQueMedia();
vetorC();


}





}