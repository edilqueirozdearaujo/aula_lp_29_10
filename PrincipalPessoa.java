package aula_29_10;

public class PrincipalPessoa {

	public static void main(String[] args) {
		//Criando a pessoa
		Pessoa pessoa = new Pessoa("Joao da Silva", "(11) 9999-9999");
		System.out.println("Pessoa:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		//Criando uma pessoa física
		PessoaFisica pessoaFisica = new PessoaFisica("Joao da Silva", "(11) 9999-9999","123.456.789-00", "300.456.989-X");
		System.out.println("\nPessoa física:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		//Criando uma pessoa jurídica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-9999", "48.591.332/0001-10");
		System.out.println("\nPessoa jurídica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("Nome: " + pessoaJuridica.getCnpj());
		
	}

}
