package Exercicio_9;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Insira a temperatura em graus Fahrenheit: ");
            double fahrenheit = entrada.nextDouble();
            double celsius =(( 5 *(fahrenheit - 32)) / 9);
            System.out.print("A temperatura em celsius é " + celsius);
            entrada.close();
        }
    }

