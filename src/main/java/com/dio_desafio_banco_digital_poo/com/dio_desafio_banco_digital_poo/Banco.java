package com.dio_desafio_banco_digital_poo.com.dio_desafio_banco_digital_poo;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		cliente.setNome(GerarDados.gerarNomeCliente());
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
