package controller;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class ExemploFormatData {
	public static  void  main (String[] args) {
		
		Date data = new Date();
		System.out.println("Data" + data);
		
		@Deprecated
		Data dataInserida = new Date(2011,9,14);
		System.out.println("Data Inserida" + dataInserida);
		
		//Esta Classe está obsoleta.
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data:" + data2);
		
		data2.set(2011, 3,19);
		System.out.println("Mês:" + data2.get(Calendar.MONTH));
		System.out.println("Dia da semana:" + data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do ano:" + data2.get(Calendar.DAY_OF_YEAR));
		
		DateForma df3 = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar data3 = new GregorianCalendar();
		data3.set(2010,8,25);
		System.out.println("Data 3(FULL):" + df3.format(data3.getTime()));
		
		
	}
	

}
