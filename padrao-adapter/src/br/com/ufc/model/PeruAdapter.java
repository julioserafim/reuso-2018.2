package br.com.ufc.model;

public class PeruAdapter implements Pato{
	private Peru peru;
	
	public PeruAdapter(Peru peru) {
		this.peru = peru;
	}

	@Override
	public void grasnar() {
		peru.gorgolejar();
		
	}

	@Override
	public void voar() {
		peru.voar();
		
	}

}
