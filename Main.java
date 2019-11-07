/*************************************************** Carlos Pereira - Restaurante ***************************************************/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ColecaoDeClientes colecao = new ColecaoDeClientes();
		float valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valorT = 0;
		int cond = 0;
		int cond2 = 0;
	do {	
		System.out.println(" --------Escolha a Função:--------  ");
		System.out.println(" 1 - Para Adicionar");
		System.out.println(" 2 - Para Remover");
		System.out.println(" Outra tecla para finalizar Programa!");
		System.out.println("-----------------------------------");
		String funcao = scanner.next();
/******************************************** Adicionar cliente ************************************************/		
		if (funcao.equals("1")) {
			Cliente cl1 = new Cliente();
			valor1 = 0;
			valor2 = 0;
			valor3 = 0;
			valor4 = 0;
			scanner.nextLine();
			System.out.println("---------------------------------");
			System.out.println("Qual seu Nome?");
			cl1.setNome(scanner.nextLine());
			System.out.println("Qual Sua Mesa?");
			cl1.setMesa(scanner.nextInt());
/******************************************** Adicionar pedido ************************************************/	
			Pedido p1 = new Pedido();
			do {
				System.out.println("---------------------------------");
				System.out.println("Qual tipo de pedido?\n");
				System.out.println(
						"1 - Entrada \n2 - Prato principal\n3 - Sobremesa\n4 - Bebida\nOutro numero para finalizar pedido!");
				int tipo = scanner.nextInt();
/********************************************* Prato de entrada***********************************************/
				if (1 == tipo) {
					valor1=0;
					scanner.nextLine();
					System.out.println("---------------------------------");
					System.out.println("Qual prato de entrada?\n");
					Comida c1 = new Comida(scanner.nextLine());
					valor1 = valor1 + c1.entrada;
					System.out.println(
							"Prato de entrada: " + c1.getDescricao() + " -------------------- Valor: R$ " + valor1 	+ "\n");

					cond = tipo;
					cond2 = 0;
/********************************************* Prato principal***********************************************/
				} else if (2 == tipo) {
					valor2=0;
					scanner.nextLine();
					System.out.println("---------------------------------");
					System.out.println("Qual prato principal?\n");
					Comida c2 = new Comida(scanner.nextLine());
					do {
						System.out.println("Qual a quantidade? P, M ou G?\n");
						c2.volume = scanner.next();
						cond = 1;
						if ((c2.volume.equals("P") || c2.volume.equals("p"))) {
							System.out.println("Pouca comida!\n");
							valor2 = valor2 + c2.p;
							System.out.println("Prato principal: " + c2.getDescricao() + " -------------------- Valor: R$ " + valor2+ "\n");
							cond = 1;
						} else if (c2.volume.equals("M") || c2.volume.equals("m")) {
							System.out.println("Quantidade normal!\n");
							valor2 = valor2 + c2.m;
							System.out.println("Prato principal: " + c2.getDescricao()+ " -------------------- Valor: R$ " + valor2+ "\n");
							cond = 1;
						} else if (c2.volume.equals("G") || c2.volume.equals("g")) {
							System.out.println("Muita comida!\n");
							valor2 = valor2 + c2.g;
							System.out.println("Prato principal: " + c2.getDescricao()+ " -------------------- Valor: R$ " + valor2+ "\n");
						} else {
							System.out.println("Errou a quantidade do almoço!\n");
							cond = 0;
						}
					} while (cond <= 0);
					cond = tipo;
					cond2 = 0;
/********************************************** Sobremesa ***************************************************/
				} else if (3 == tipo) {
					valor3 = 0;
					scanner.nextLine();
					System.out.println("---------------------------------");
					System.out.println("Qual sua sobremesa?\n");
					Comida c3 = new Comida(scanner.nextLine());
					valor3 = valor3 + c3.sobremesa;
					System.out.println("Prato de entrada: " + c3.getDescricao() + " -------------------- Valor: R$ " + valor3+ "\n");
					cond = tipo;
					cond2 = 0;
/*********************************************** Bebidas ***************************************************/
				} else if (4 == tipo) {
					valor4 = 0;
					scanner.nextLine();
					System.out.println("---------------------------------");
					System.out.println("Qual sua bebida?\n");
					System.out.println("1 - Refrigerante 500ml");
					System.out.println("2 - Refrigerante 1L?");
					System.out.println("3 - Suco 500ml");
					System.out.println("4 - Cerveja 600ml");
					Bebida b = new Bebida(scanner.nextLine());
					if (b.getDescricao().equals("1")) {
						Bebida b1 = new Bebida("Refrigetante 500ml");
						valor4 = valor4 + b1.refri500;
						System.out.println(
								"Prato de entrada: " + b1.getDescricao() + " -------------------- Valor: R$ " + valor4+ "\n");
					} else if (b.getDescricao().equals("2")) {
						Bebida b2 = new Bebida("Refrigerante 1L");
						valor4 = valor4 + b2.refri1L;
						System.out.println(
								"Prato de entrada: " + b2.getDescricao() + " -------------------- Valor: R$ " + valor4+ "\n");
					} else if (b.getDescricao().equals("3")) {
						Bebida b3 = new Bebida("Suco 500ml");
						valor4 = valor4 + b3.suco;
						System.out.println(
								"Prato de entrada: " + b3.getDescricao() + " -------------------- Valor: R$ " + valor4+ "\n");
					} else if (b.getDescricao().equals("4")) {
						Bebida b4 = new Bebida("Cerveja 600ml");
						valor4 = valor4 + b4.cerveja;
						System.out.println(
								"Prato de entrada: " + b4.getDescricao() + " -------------------- Valor: R$ " + valor4+ "\n");
					} else {
						System.out.println("Opção errada!");
					}
					cond = tipo;
					cond2 = 0;
/******************************************** Finalizar pedido *************************************************/
				} else {
					System.out.println("--------------------Pedido finalizado!!!-------------------\n");
					valorT = valor1 + valor2 + valor3 + valor4;
					cl1.setValor(valorT);
					System.out.println("-------------------- Total a pagar: " + valorT+ " --------------------\n");
					colecao.adicionar(cl1);
					colecao.listar();
					cond = 0;
					cond2 = 0;
				}
			} while (cond > 0);
/******************************************** Remover pedido ***************************************************/			
		} else if (funcao.equals("2")) {
			if(colecao.listaDeClientes.size() > 0) {
			colecao.listar();
			System.out.println("Digite o indice do pedido para remover?\n");
			int i = scanner.nextInt();
			colecao.remover(i);
			colecao.listar();
			cond2 = 0;
			}else {
			System.out.println("Você não tem pedido para remover!!!\n");
			}
/******************************************** Finalizar Programa ************************************************/
			}else {
				cond2 = 1;
				System.out.println("------------- Programa Finalizado!!! -----------\n");
				System.out.println("********** Carlos Pereira - Restaurante **********");
			}
		} while (cond2 <= 0);
	}
}
