package controller;

public class ExemploClasseMath {
	public static void main( String[] args) {
		
		//Sorteando um numero entre 50 e 80
		double ValSorteado = Math.random();
		int resultado = 50 + (int) (ValSorteado * 30);
		System.out.println("Sorteio entre 50 e 80: " + resultado);
		
		// Sorteando a mega-sena
		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("N�mero Sorteado: " + numeroSorteado);
		}
	}

}
