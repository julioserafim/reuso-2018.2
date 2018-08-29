package br.com.ufc.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

import br.com.ufc.model.CEP;

public class CepServico {
	
	private String cep;

	public CepServico(String cep) {
		this.cep = cep;
	}
	
	public CEP retornarCep() {
		StringBuilder resposta = new StringBuilder();
		
		try {
			URL url = new URL("http://ws.matheuscastiglioni.com.br/ws/cep/find/" + this.cep + "/json/");
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			conexao.setRequestMethod("GET");
			conexao.setRequestProperty("Content-type", "application/json");
			conexao.setRequestProperty("Accept", "application/json");
			conexao.connect();
			
			Scanner scanner = new Scanner(url.openStream());
			while(scanner.hasNext()) {
				resposta.append(scanner.next());
			}
			
			conexao.disconnect();
			scanner.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return new Gson().fromJson(resposta.toString(), CEP.class);
	}
	
	
	

}
