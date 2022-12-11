package Exercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da lateral do quadrado: ");
        Float lado = entrada.nextFloat();
        System.out.println("O dobro da área do quadrado é: " + ((lado * lado) * 2) );
        entrada.close();
    }
}
