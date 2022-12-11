package Exercicio_4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        int notas[] = new int [4];
        int i;
        float total = 0, média;
        try (Scanner entrada = new Scanner(System.in)) {
            for(i = 0; i < 4; i++) {
                System.out.print("Digite a nota " + (i+1) +":");
                notas [i] = entrada.nextInt();
                total = total + notas [i];
   }
   entrada.close();
        }
        média = total/4;
    System.out.print("A média do estudante é: ");
    if (média >= 80)
    {
        System.out.print("A");
    }   
    else if (média >= 60 && média < 80)
    {
        System.out.print("B");
    }
    else if (média >= 40 && média < 60)
    {
        System.out.print("C");
    }
    else   
    {
        System.out.print("D");
    }
  }
}
