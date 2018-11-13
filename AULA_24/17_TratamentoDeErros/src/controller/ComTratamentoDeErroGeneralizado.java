package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ComTratamentoDeErroGeneralizado {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 int va11 = obtemNumero("Primeiro");
  int v12 = obtemNumero("Segundo");
  System.out.println("Número lidos: " + va11 + " e " + v12);
	}
	static int obtemNumero (String n) throws NumberFormatException, IOException {
		System.out.println("Digite o " + n + "numero: ");
		return lerNumero();
	}
	static int lerNumero() throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		int x = Integer.parseInt(teclado.readLine());
		return x;
		
		
  
	}

}
