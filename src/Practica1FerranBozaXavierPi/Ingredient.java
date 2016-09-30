package Practica1FerranBozaXavierPi;

public class Ingredient {
	
	private int codi;
	private String nom;
	private int proveidor;
	
	public Ingredient(int codi, String nom, int proveidor){
		this.codi = codi;
		this.nom = nom;
		this.proveidor = proveidor;
	}

	public int getCodi() {
		return codi;
	}
	public String getNom() {
		return nom;
	}
	public int getProveidor() {
		return proveidor;
	}
	public void setCodi(int codi) {
		this.codi = codi;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setProveidor(int proveidor) {
		this.proveidor = proveidor;
	}
	
	
	@Override
	public String toString() {
		return "Ingredient [codi=" + codi + ", nom=" + nom + ", proveidor=" + proveidor + "]";
	}
	
	public boolean equals(Object o){
		if(o instanceof Ingredient){
			if(((Ingredient) o).codi == this.codi){
				return true;
			}
		}
		throw new IllegalArgumentException ("No és un ingredient");
	}
	

}
