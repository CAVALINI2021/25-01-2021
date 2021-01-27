package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
	
		//Criação do Cliente
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alvares Cabral");
		pedro.setCpf("123456789");
		pedro.setTelefone("(11)4789-3393");
		pedro.setCep("06624300");
		
		//Criar conta do Pedro 
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("2222-2");
	
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(pedro.getNome());
		
	}

}
