package Controller;

public class EscopoDeVariavel {
   static int x = 1; //Var�avel global
	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entra no metodoA � " + x);
		x = x + 1;
		System.out.println("Variavel local x antes de sair do metodoA � " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no inicio de main() � " + x);
		metodoA();
		metodoB();
	}
	  public static void metodoB() {
		  System.out.println("Variavel x ao entra no metodoB � "+ x +"global.");
		  x = x*10;
		  System.out.println("Variavel x antes de sair do metodoB � " + x);
	  }
}
