public class Cliente {

	//Atributos
	String nome;
	String CPF;
	int quantidadesPedidos;
	
	//Criação de Metodo efetuar Pedido de Compra da Classe  Cliente
	void efetuarPedidoCompra (){
		System.out.println("Efetuar Pedido de Compra");
		quantidadesPedidos++;
	}
	
	@Override
	public String toString() {
		
		String atributosClasse = "Nome \n" + nome + "\n CPF: \n" + CPF + " " + "\n Quantidade: \n" + quantidadesPedidos;
		
		return atributosClasse;
	}

	
		
}
