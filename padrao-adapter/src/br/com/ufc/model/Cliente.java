package br.com.ufc.model;

public class Cliente {
	public static void main(String[] args) {
		Patolino patolino = new Patolino();
		PeruAustraliano peruAustraliano = new PeruAustraliano();
		
		//Vamos usar o peru como se fosse um pato
		PeruAdapter peruAdapter = new PeruAdapter(peruAustraliano);
		
		System.out.println("O pato diz: ");
		testPato(patolino);
		
		System.out.println("O peru diz: ");
		testPato(peruAdapter);
		
	}
	
	static void testPato(Pato pato) {
		pato.grasnar();
		pato.voar();
	}
}
