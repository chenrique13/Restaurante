/*************************************************** Carlos Pereira - Restaurante ***************************************************/
import java.util.ArrayList;

public class ColecaoDeClientes {

	ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

	void adicionar(Cliente p) {
		listaDeClientes.add(p);
		System.out.println("******************** Adicionando Pedido a lista... ********************");
		System.out.println("Tamanho da Lista = " + listaDeClientes.size() + "\n");
	}

	void remover(Cliente p) {
		listaDeClientes.remove(p);
		System.out.println("Remover");
	}

	void remover(int i) {
		listaDeClientes.remove(i);
		System.out.println("*************************  Removendo Pedido... *************************");
	}

	void listar() {
		if (listaDeClientes.size() > 0) {
			for (int i = 0; i < listaDeClientes.size(); i++) {
				int cont = 0;
				cont = i + 1;
				System.out.println("---------------------------------");
				System.out.println("Indice: " + (i) + "");
				System.out.println("Nome do Cliente: " + listaDeClientes.get(i).getNome());
				System.out.println("Numero do Pedido: " + cont);
				System.out.println("Mesa do Cliente: " + listaDeClientes.get(i).getMesa() + "\n");
				System.out.println("------------------ Total a Pagar:  " + listaDeClientes.get(i).getValor() + "  ----------------\n");
			}
		} else {
			System.out.println("Nenhum pedido para remover!!!");
		}
	}
}
