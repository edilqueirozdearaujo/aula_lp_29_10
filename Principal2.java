package aula_29_10;

public class Principal2 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Joao da Silva", "123.456.789-00", 1500.00, "ASD", "Obras");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		
		Atendente atendente = new Atendente("John da Silva", "123.456.888-00", 1900.00, "Atendente", "SAC",350.00);
		System.out.println("\nAtendente:");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF: " + atendente.getCpf());
		System.out.println("Salario: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Ajuda de custo: " + atendente.getAjudaDeCusto());
		
		Gerente gerente = new Gerente("Frans Run", "123.456.888-00", 3000.50, "Gerente geral", "Adm", "Auxilio-saúde",500.00);
		System.out.println("\nAtendente:");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salario: " + gerente.getSalario());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Benefícios: " + gerente.getBeneficios());
		System.out.println("Premiação: " + gerente.getPremiacao());
		

	}

}
