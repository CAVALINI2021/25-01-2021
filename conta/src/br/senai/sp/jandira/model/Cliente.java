package br.senai.sp.jandira.model;

public class Cliente { 
	
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	
	//NOME
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//CPF
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//TELEFONE 
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//CEP
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
}
