package com.salon.management.client.clienteservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.salon.management.client.clienteservice.Models.Cliente;
import com.salon.management.client.clienteservice.Models.Pessoa;
import com.salon.management.client.clienteservice.Models.Cliente.ClienteBuilder;
import com.salon.management.client.clienteservice.Models.EnumModels.TipoPagamento;

@SpringBootApplication
public class ClienteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServiceApplication.class, args);
		
		ClienteBuilder c1 = Cliente.ClienteBuilder.build()
			.contato(11)
			.ddd(85)
			.historico(Arrays.asList("endereco1", "endereco2"))
			.tipoPagamento(TipoPagamento.Cretido)
		.pessoa(new Pessoa("Diego", "fortaleza", 30));

		
	System.out.println(c1);
	}

}
