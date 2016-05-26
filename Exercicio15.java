package Exercicio;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite quanta quanha por hora: ");
		double phora = ler.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha: ");
		double nhoras = ler.nextDouble();
		
		double salario = phora * nhoras;
		double irenda = salario * 0.11;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		double salarioliquido = salario - irenda - inss - sindicato;
		
		System.out.println("O seu salário bruto é: " + salario);
		System.out.println("Pagou de Inss o valor de: " + inss);
		System.out.println("Pagou ao Sindicato: " + sindicato);
		System.out.println("O salário líquido foi de: " + salarioliquido);
		
		
		
		
		

	}

}
