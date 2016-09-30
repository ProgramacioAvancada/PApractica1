package Practica1FerranBozaXavierPi;

public class Addicional extends Article {
	
	private String marcaComercial;
	private int proveidor;
	
	public Addicional(int codi, String nom, String marcaComercial, int proveidor) {
		super(codi, nom);
		this.marcaComercial = marcaComercial;
		this.proveidor = proveidor;
	}

	public Addicional(int codi, float preuCost, float preuPublic, String nom, String marcaComercial, int proveidor) {
		super(codi, preuCost, preuPublic, nom);
		this.marcaComercial = marcaComercial;
		this.proveidor = proveidor;
	}

	public String getMarcaComercial() {return marcaComercial;}
	public int getProveidor() {return proveidor;}

	public void setMarcaComercial(String marcaComercial) {this.marcaComercial = marcaComercial;}
	public void setProveidor(int proveidor) {this.proveidor = proveidor;}

	@Override
	public String toString() {
		return "Addicional [getCodi()=" + getCodi() + ", getNom()=" + getNom() + ", getPreuCost()=" + getPreuCost()
				+ ", getPreuPublic()=" + getPreuPublic() + ", marcaComercial=" + marcaComercial + ", proveidor="
				+ proveidor + "]";
	}
	
}
