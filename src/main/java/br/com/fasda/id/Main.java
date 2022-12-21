package br.com.fasda.id;

public class Main {
	
	public static void main(String[] args) {
		Pedidos pedidos = new Pedidos();
		
		// Injeção de dependência pelo construtor(pedidos)
		//RelatorioService relatorioService = new RelatorioService(pedidos);
		
		// Injeção de dependência pelo metodo setPedidoss
		RelatorioService relatorioService = new RelatorioService();
		relatorioService.setPedidos(pedidos);
		
	}

}
