package controller;

import util.Teclado;

public class programacaoMultiplaEscolha {
	public static void main(String[] args) {
		int matr, numFinal;
		matr = Teclado.lerInt("Infomer matr�cula");
		numFinal = matr % 10;
		switch (numFinal) {
		case 0:
			System.out.println("Pagamento em Janeiro");
			break;
		case 1:
			System.out.println("Pagamento em Fervereiro");
			break;
		case 2:
			System.out.println("Pagamento em Mar�o");
			break;
		case 3:
			System.out.println("Pagamento em Abril");
			break;
		default:
			System.out.println("Pagamento em Maio");

		}
	}

}
