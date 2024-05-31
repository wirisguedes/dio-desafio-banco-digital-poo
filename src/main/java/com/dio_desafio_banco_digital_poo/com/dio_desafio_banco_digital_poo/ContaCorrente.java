package com.dio_desafio_banco_digital_poo.com.dio_desafio_banco_digital_poo;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		tipoConta = "Corrente";
	}

}
