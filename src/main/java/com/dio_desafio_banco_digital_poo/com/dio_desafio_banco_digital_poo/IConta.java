package com.dio_desafio_banco_digital_poo.com.dio_desafio_banco_digital_poo;

public interface IConta {
	
void sacar(double valor);
	
	public void depositar(double valor);
	
	public void transferir(double valor, IConta contaDestino);
	
	public void imprimirExtrato();

}
