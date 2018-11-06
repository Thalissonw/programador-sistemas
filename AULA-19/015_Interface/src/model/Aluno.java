package model;

public class Aluno extends Usuario implements IUsuario{
	private String turma;
	private String nome;
	private String turno;
	int matriculaAluno;
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	
	@Override  
   public void mostrar () {
		System.out.println("Informação do aluno:");
		System.out.println("Login:" + super. getLogin());
		System.out.println("Senha: ******");
		
		
		System.out.println("Matricula: " + matriculaAluno);
		System.out.println("Nome: " + nome);
		System.out.println("Turno: " + turno);
		System.out.println("Turma: " + turma); 
		
	}
	 public Aluno() {
		 //TODO Auto-generated constructor stub
		 super();
	 }
	  public Aluno(String login, String senha, int tipo, String nome,
			  String turno, String turma, int matriculaAluno) {
		   super(login, senha,tipo);
		   this.nome = nome;
		   this.turno = turno;
		   this.turma = turma;
		   this.matriculaAluno = matriculaAluno;
	  }
		   
		   
		   @Override
		   public boolean validarLogin(String login, String senha) {
			   if(getLogin() .equals(login) && getSenha () .equals(senha)) {
				   return true;
				   
			   }
			   return false;
				   
			   }
		   
}

     
