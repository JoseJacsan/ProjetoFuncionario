package testeFuncionario;

import java.util.Locale;
import java.util.Scanner;
import funcionario.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Nome do funcionário");
		funcionario.setNome(leitor.nextLine());
		
		System.out.println("CPF: ");
		funcionario.setCpf(leitor.nextLine());
		
		System.out.println("Salário: " );
		funcionario.setSalario(leitor.nextDouble());
		
		double bonificacao = funcionario.getBonificacao();
		double novoSalario = funcionario.getSalario() + funcionario.getBonificacao();
		
		System.out.println("Nome do funcionário: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.printf("Salário: R$ %.2f%n", funcionario.getSalario());
		System.out.printf("Bônus recebido: R$ %.2f%n", bonificacao);
		System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
		
		
		leitor.close();
		
	}
	
	
}
