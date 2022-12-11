package Exercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();
        int soma = numero1 + numero2;
        System.out.println();
        System.out.println("A soma é: " + soma);
        entrada.close();
    }
}
