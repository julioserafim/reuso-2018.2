package br.com.ufc.test;

import br.com.ufc.model.CEP;
import br.com.ufc.service.CepServico;

public class TesteServico {
	public static void main(String[] args) {
		CEP cep = new CepServico("6300000").retornarCep();
		System.out.println("RETORNO: " + cep.getCidade());
	}
}
