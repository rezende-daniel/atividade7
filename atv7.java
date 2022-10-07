// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;



public class atv7 {

    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

        // Variaveis
        double lado;
        double area;
        double dobroArea;

        //Entrada de dados

        System.out.print("Insira o valor do lado do quadrado ");
        lado = entrada.nextDouble();
        entrada.close();

        //Processamento de dados
        area = lado*lado;
        dobroArea = area*2;

        //Saida de dados

        System.out.print("O dobro da area do quadrado é "+dobroArea+"");
        





    }


    
}
