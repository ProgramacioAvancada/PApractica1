package Practica1FerranBozaXavierPi;

public class Postres extends Addicional {
	
	private boolean cullera;
	private boolean esFred;

	public Postres(int codi, float preuCost, float preuPublic, String nom, String marcaComercial, int proveidor, boolean cullera, boolean esFred) {
		super(codi, preuCost, preuPublic, nom, marcaComercial, proveidor);
		this.cullera = cullera;
		this.esFred = esFred;
	}

	public boolean isCullera() {return cullera;}
	public boolean isEsFred() {return esFred;}

	public void setCullera(boolean cullera) {this.cullera = cullera;}
	public void setEsFred(boolean esFred) {this.esFred = esFred;}

	@Override
	public String toString() {
		return "Postres [getCodi()=" + getCodi() + ", getNom()=" + getNom() + ", getPreuCost()=" + getPreuCost()
				+ ", getPreuPublic()=" + getPreuPublic() + ", getMarcaComercial()=" + getMarcaComercial()
				+ ", getProveidor()=" + getProveidor() + ", cullera=" + cullera + ", esFred=" + esFred + "]";
	}

}
