package Exercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de metros para a conversão: ");
        float metros = entrada.nextFloat();
        float centímetros = metros * 100;
        System.out.printf("%.1f cm",centímetros);
        entrada.close();
    }
}
