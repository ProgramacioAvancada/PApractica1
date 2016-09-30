package Practica1FerranBozaXavierPi;

public class Entrepa extends Propi {
	
	private int tipusPa;
	private boolean esCalent;

	public Entrepa(int codi, String nom, int tipusPa, boolean esCalent) {
		super(codi, nom);
		this.tipusPa = tipusPa;
		this.esCalent = esCalent;
	}
	
	public Entrepa(int codi, float preuCost, float preuPublic, String nom, int tipusPa, boolean esCalent) {
		super(codi, preuCost, preuPublic, nom);
		
	}

	public int getTipusPa() {return tipusPa;}
	public boolean isEsCalent() {return esCalent;}

	public void setTipusPa(int tipusPa) {this.tipusPa = tipusPa;}
	public void setEsCalent(boolean esCalent) {this.esCalent = esCalent;}

	@Override
	public String toString() {
		return "Entrepa [getCodi()=" + getCodi() + ", getNom()=" + getNom() + ", getPreuCost()=" + getPreuCost()
				+ ", getPreuPublic()=" + getPreuPublic() + ", tipusPa=" + tipusPa + ", esCalent=" + esCalent + "]";
	}
	
	

}
