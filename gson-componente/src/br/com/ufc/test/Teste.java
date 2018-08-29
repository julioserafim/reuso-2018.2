package br.com.ufc.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;

import br.com.ufc.model.Endereco;
import br.com.ufc.model.Estudante;

public class Teste {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setCidade("Quixadá");
		endereco.setRua("Rua");
		endereco.setPais("Brasil");
		
		Estudante estudante = new Estudante();
		estudante.setEmail("email@gmail.com");
		estudante.setNome("julio");
		estudante.setEndereco(endereco);
		estudante.setVaiPassarEmReuso(true);
		
		Gson gson = new Gson();
		String jsonVindo = gson.toJson(estudante);
		
		
		System.out.println("APRECIE: " + jsonVindo);
		
		File file = new File("/home/juliomartins/Documents/arquivo.json");
		try {
			Reader reader = new FileReader(file);
			Estudante estudante2 = gson.fromJson(reader, Estudante.class);
			System.out.println("ESTUDANTE2:" + estudante2.getEmail());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
