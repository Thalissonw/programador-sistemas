package controller;
import model.*;

public class Teste {

	public static void main(String[] args) {
         // TODO Auto-generated method stub
		// Usuario usu = new Usuario();
		Professor prof = new Professor(
				"Joaquim", "Joaquim123", 0, "Joaquim da silva",
				"Doutor",1123); 
		prof.mostrar();
		System.out.println("================");
		Aluno aluno = new Aluno("muz"," muzi123", 1, "Sergio muzi",
				"primeiro", "tarde", 32115);
		aluno.mostrar();
				
	}
	
}
	
	

