package controller;
 import java.util.ArrayList;
 import model.*;
public class Zoo 
	{

		public static void main(String[]args)
		{
			// create an ArrayList of animals
			ArrayList<Animal> animals = new ArrayList<Animal>();
			animals.add(new Cachorro("krypto")); // append a dog object to the list
			animals.add(new Gato("Bela")); // aPP a cat object to the list
			animals.add(new Cachorro("Rocky")); // append a dog object to the list
			animals.add(new Gato("Molly")); //append a cat object to the list
			animals.add(new Periquito("P1")); // append a cat object to the list
			animals.add(new Periquito("P2")); //aPP a cat object to the list
			  
			//generically process each element int arraylist animals
			for (Animal animal: animals)
			{
				System.out.println(animal.seuNome() +";" + animal.seuBarulho());
		}
	}

}
