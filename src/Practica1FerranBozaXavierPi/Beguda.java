package Practica1FerranBozaXavierPi;

public class Beguda extends Addicional {
	
	private boolean teGas;
	private boolean teAlcohol;

	public Beguda(int codi, String nom, String marcaComercial, int proveidor, boolean teGas, boolean teAlcohol) {
		super(codi, nom, marcaComercial, proveidor);
		this.teGas = teGas;
		this.teAlcohol = teAlcohol;
	}
	
	public Beguda(int codi, float preuCost, float preuPublic, String nom, String marcaComercial, int proveidor, boolean teGas, boolean teAlcohol) {
		super(codi, preuCost, preuPublic, nom, marcaComercial, proveidor);
		this.teGas = teGas;
		this.teAlcohol = teAlcohol;
	}

	public boolean isTeGas() {return teGas;}
	public boolean isTeAlcohol() {return teAlcohol;}

	public void setTeGas(boolean teGas) {this.teGas = teGas;}
	public void setTeAlcohol(boolean teAlcohol) {this.teAlcohol = teAlcohol;}

	@Override
	public String toString() {
		return "Beguda [getCodi()=" + getCodi() + ", getNom()=" + getNom() + ", getPreuCost()=" + getPreuCost()
				+ ", getPreuPublic()=" + getPreuPublic() + ", getMarcaComercial()=" + getMarcaComercial()
				+ ", getProveidor()=" + getProveidor() + ", teAlcohol=" + teAlcohol + ", teGas=" + teGas + "]";
	}
	
}
