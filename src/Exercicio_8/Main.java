package Exercicio_8;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Double valorHora;
        Double horasTrabalhadas;
        Double valorMes;
        System.out.println("Digite o valor que você ganha por hora: ");
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que você ganha por hora"));
        System.out.println("Digite as horas trabalhadas no mês: ");
        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas no mês"));
        valorMes = (valorHora * horasTrabalhadas);
        System.out.println("O valor do salário no mês é: " + valorMes);
    }
}
