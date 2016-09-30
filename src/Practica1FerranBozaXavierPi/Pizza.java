package Practica1FerranBozaXavierPi;

public class Pizza extends Propi {
	
	private int tipusMassa;

	public Pizza(int codi, String nom, int tipusMassa) {
		super(codi, nom);
		this.tipusMassa = tipusMassa;
	}

	public Pizza(int codi, float preuCost, float preuPublic, String nom, int tipusMassa) {
		super(codi, preuCost, preuPublic, nom);
		this.tipusMassa = tipusMassa;
	}

	public int getTipusMassa() {return tipusMassa;}

	public void setTipusMassa(int tipusMassa) {this.tipusMassa = tipusMassa;}

	@Override
	public String toString() {
		return "Pizza [getCodi()=" + getCodi() + ", getNom()=" + getNom() + ", getPreuCost()=" + getPreuCost()
				+ ", getPreuPublic()=" + getPreuPublic() + ", tipusMassa=" + tipusMassa + "]";
	}
	
	

}
