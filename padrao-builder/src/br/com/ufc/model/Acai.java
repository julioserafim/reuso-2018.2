package br.com.ufc.model;

public class Acai {
	
	private double precoAcaiPuro;
	private boolean bolasDechocolate;
	private boolean leiteNinho;
	private boolean castanha;
	
	
	public static class Builder{
		private final double precoAcaiPuro;
		
		private boolean bolasChocolate = false;
		private boolean leiteNinho = false;
		private boolean castanha = false;
		
		public Builder(double preco) {
			this.precoAcaiPuro = preco;
		}
		
		public Builder bolasDeChocolate() {
			bolasChocolate = true;
			return this;
		}
		
		public Builder leiteNinho() {
			leiteNinho = true;
			return this;
		}
		
		public Builder castanha() {
			castanha = true;
			return this;
		}
		
		public Acai build() {
			return new Acai(this);
		}
		
	}
	
	private Acai(Builder builder) {
		precoAcaiPuro = builder.precoAcaiPuro;
		bolasDechocolate = builder.bolasChocolate;
		leiteNinho = builder.leiteNinho;
		castanha = builder.castanha;
	}

	@Override
	public String toString() {
		return "Acai [precoAcaiPuro=" + precoAcaiPuro + ", bolasDechocolate=" + bolasDechocolate + ", leiteNinho="
				+ leiteNinho + ", castanha=" + castanha + "]";
	}
	
	
	
	

}
