//Importação do Date
import java.util.Date;

public class Teste {

	//Este programa começa com essa Classe
	public static void main(String[] args) {
		System.out.println("Oi Java");

		//Instanciaando o Objeto Data Atual
		Date dataAtual = new Date();  
		System.out.println("A data atual é :" + dataAtual.toString());
			
		// Definindo o objeto		
		Cliente cliente1;
		//Instanciando o Objeto cliente1
		cliente1 = new Cliente();
		
		//Chamei os Atributos, dando valores
		cliente1.nome = "Nielson Wagner";
		cliente1.CPF = "027.xxx.xxx-xx";
		cliente1.efetuarPedidoCompra();
		
		// Imprimi o conteudo cliente1 
		System.out.println("O nome, CPF e a quantidade de Pedidos do Cliente1: \n" + cliente1.toString());
		
		
		Cliente cliente2;
		cliente2 = new Cliente();
		cliente2.nome = "Ana Beatriz";
		cliente2.CPF = "062.xxx.xxx-xx";
		cliente2.efetuarPedidoCompra();
		cliente2.efetuarPedidoCompra();
		
		System.out.println("O nome, CPF e a quantidade de pedidos do Cliente2: \n" + cliente2.toString());
		
	}

}
