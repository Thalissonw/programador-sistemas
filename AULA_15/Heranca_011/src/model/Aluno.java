package model;

public class Aluno extends pessoa{ 
 
	private String matricula;
	private String curso;
	
	public String getMtricula () {
		return matricula;
	}
	public void setMatricula (String curso ) {
		this.curso = curso;
	}
	public Aluno (String nome, String rg, String cpf, String telefone, String email,
	String matricula, String curso ) {
		super(nome, rg, cpf, telefone, email);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	}


