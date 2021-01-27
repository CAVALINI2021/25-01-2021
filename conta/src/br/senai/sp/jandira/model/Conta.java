package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;
	
	//TIPO
	public void setTipo(String tipo) {
		if (tipo.equals("Corrente") || tipo.equals("Poupança")) {
			this.tipo = tipo;
		}else {
			System.out.println("Tipo inválido!");
		}
	}			
	
	public String getTipo() {
		return this.tipo;
	}
	
	
	//SALDO 
		public void mostrarSaldoDaConta() {
			System.out.println("Saldo: " + saldo);
			System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
		}
		
		public double getSaldo(){
			return saldo;
		}
	
	//NUMERO
		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getNumero() {
			return this.numero;
		}
	
	//TITULAR 
		public void setTitular(Cliente titular) {
			this.titular= titular;
		}

		public Cliente getTitular() {
			return this.titular;
		}
	
	//ATIVA
		public void setAtiva(boolean ativa ) {
			this.ativa = ativa ;
		}
		
		public boolean isAtiva() {
			return this.ativa;
		}
	
	//CHEQUE ESPECIAL
		public void setChequeEspecial(double ChequeEspecial) {
			this.chequeEspecial = chequeEspecial;
		}
		
		public double getChequeEspecial() {
			return this.chequeEspecial;
		}
		
	
	//DEPOSITAR
	public void depositar(double valorDeposito) {	
		if (valorDeposito < 0) {
			System.out.println("Valor inválido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	//SALDO 
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	//SACAR
	public void sacar(double valorDoSaque) {	
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}	
	}
	
	//TRANSFERIR
	public void transferir() {
	}
	
}
	
	


	
	