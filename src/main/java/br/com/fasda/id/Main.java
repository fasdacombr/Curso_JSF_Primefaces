package br.com.fasda.id;

public class Main {
	
	public static void main(String[] args) {
		Pedidos pedidos = new Pedidos();
		
		// Inje��o de depend�ncia pelo construtor(pedidos)
		//RelatorioService relatorioService = new RelatorioService(pedidos);
		
		// Inje��o de depend�ncia pelo metodo setPedidoss
		RelatorioService relatorioService = new RelatorioService();
		relatorioService.setPedidos(pedidos);
		
	}

}
