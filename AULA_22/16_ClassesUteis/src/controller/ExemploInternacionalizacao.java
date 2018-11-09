package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploInternacionalizacao {
 public static void main (String [] args) {
	 
	 
	 Locale.setDefault(Locale.FRANCE);
	 NumberFormat f = NumberFormat.getCurrencyInstance();
	  double valor = 55008.537;
	  System.out.println("Sem formatação: " + valor);
	  System.out.println("Formatado:" + f.format(valor));
	  System.out.println("=======================");
	  
		 Locale.setDefault(Locale.UK);
		 NumberFormat g = NumberFormat.getCurrencyInstance();
		  System.out.println("Sem formatação: " + valor);
		  System.out.println("Formatado:" + f.format(valor));
		  System.out.println("=======================");
	  
	  
	  
	  
	  //Normas: Iso 639-> Idioma ; Iso 3166 -> Localidade
	  Locale local = new Locale("pt", "BR");
	  NumberFormat nf = NumberFormat.getCurrencyInstance(local);
	  System.out.println("Sem Formatação: " + valor);
	  System.out.println("Formatado: " + nf.format(valor));
 }
}
