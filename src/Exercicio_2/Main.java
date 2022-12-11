package Exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        System.out.println("O número digitado foi: " + numero);
        entrada.close();
        
    }
}
