package controller;

import util.Teclado;

public class BatalhaNavalpontos {

	public static void main(String[] args) {

		// primeiro indece da linha, depois o indece da coluna
		String arena[][] = new String[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arena[i][j] = "Água";
			}
		}
		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Aviões";
		arena[0][2] = "Navio";

		int linha, coluna;
		
 
		for(int a = 0; a < 4; a++) {
		  
		linha = Teclado.lerInt("Digite a coordenada DA LINHA:");
		coluna = Teclado.lerInt("Digite a coordenada da coluna:");

		System.out.println("Voê acertou:" + arena[linha][coluna]);
		}
	}
}


