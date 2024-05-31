package com.dio_desafio_banco_digital_poo.com.dio_desafio_banco_digital_poo;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 2020;
	
	protected int agencia;
	protected String numero;
	protected double saldo;
	protected Cliente cliente;
	protected String tipoConta;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = GerarDados.gerarConta();
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta " + tipoConta + " ===");
		//super.imprimirInfosComuns();
		imprimirInfosComuns();
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %s", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
