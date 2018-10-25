package controller;

import util.Teclado;

public class Operadores 
{
	public static void main(String[] args) {
	//Leitura de texto
	String nome;
	nome = Teclado.LerTexto("Digite seu nome:");
	//Leitura de inteiro
	int nota1;
	int nota2;
	int nota3;
	int nota4;
	
	nota1 = Teclado.lerInt("Digite nota1: ");
	nota2 = Teclado.lerInt("Digite nota2: ");
	nota3 = Teclado.lerInt("Digite nota 3: ");
	nota4 = Teclado.lerInt("Digite nota 4: ");
	
    int media;
     media = nota1 + nota2 + nota3 + nota4;
     media = media / 4;
     System.out.println("Nome imformado:" + nome);
     System.out.println("Sua média é: " + media);
     
}
}