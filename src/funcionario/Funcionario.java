package funcionario;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	//método de bonificação
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
