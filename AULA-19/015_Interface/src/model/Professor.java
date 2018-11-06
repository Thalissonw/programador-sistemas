package model;

public  class Professor extends Usuario  implements IUsuario{
	private String nome;
	private String especialidade;
	private int matriculaProfessor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	
	@Override 
	public void mostrar() {
		System.out.println("Informação do aluno:");
		System.out.println("Login:" + super. getLogin());
		System.out.println("Senha: ******");
		
		
		System.out.println("Matricula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
		System.out.println("Especialidade: " + especialidade);
	}
	
	public Professor() {
		//TODO Auto-generated constructor stub
		super();
	}
	
	  public Professor(String login, String senha, int tipo, String nome, String especialidade,
			  int matriculaProfessor) {
		   super(login, senha, tipo);
		   this.nome = nome;
		   this.especialidade = especialidade;
		   this.matriculaProfessor = matriculaProfessor;
	
		   
	  }
	   @Override
	   public boolean validarLogin(String login, String senha) {
		   if(getLogin() .equals(login) && getSenha () .equals(senha)) {
			   return true;
			   
		   }
		   return false;
		   
	   }}
			   
		
	
		