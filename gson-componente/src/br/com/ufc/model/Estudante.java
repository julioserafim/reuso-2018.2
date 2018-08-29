package br.com.ufc.model;

public class Estudante {
	private String nome;
	private String email;
	private boolean vaiPassarEmReuso;
	private Endereco endereco;
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVaiPassarEmReuso() {
		return vaiPassarEmReuso;
	}
	public void setVaiPassarEmReuso(boolean vaiPassarEmReuso) {
		this.vaiPassarEmReuso = vaiPassarEmReuso;
	}
	
	
}
