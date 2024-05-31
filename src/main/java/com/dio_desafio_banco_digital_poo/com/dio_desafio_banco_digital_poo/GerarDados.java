package com.dio_desafio_banco_digital_poo.com.dio_desafio_banco_digital_poo;

import java.util.Locale;

import net.datafaker.Faker;

public class GerarDados {
	
	static Faker faker = new Faker(new Locale("pt-BR"));

	public static String gerarNomeCliente() {
		String nome = faker.name().fullName();
		
		return nome;
	}
	
	public static String gerarConta() {
		String conta = faker.number().digits(5);
		
		return conta;
	}
   
}
