package br.com.ufc.model;

public class Patolino implements Pato{

	@Override
	public void grasnar() {
		System.out.println("Quack, Quack, Quack");
		
	}

	@Override
	public void voar() {
		System.out.println("Oi gente, tô voandoooo!");
		
	}

}
