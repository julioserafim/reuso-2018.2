package br.com.ufc.model;

public class Teste {
	public static void main(String[] args) {
		Acai acai = new Acai.Builder(15.55)
							.bolasDeChocolate()
							.castanha()
							.build();
		
		System.out.println("Acai :" + acai.toString());
	}
}
