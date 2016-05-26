package Exercicio;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite quantos kg de Peixes você conseguiu: ");
		
		int peso = ler.nextInt();
		int excesso = peso - 50;
		int multa = excesso * 4;
		
		if (peso > 50){
			System.out.println("O valor a ser pago com multa é: R$" + (excesso + multa));
		}
		else {
			System.out.println("Excesso = 0 \n multa = 0");
		}

	}

}
