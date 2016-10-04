package Practica1FerranBozaXavierPi;

public class Article{
	
	private int codi;
	private float preuCost;
	private float preuPublic;
	private String nom;
	
	public Article(int codi, String nom){
		this(codi, 0, 0, nom);
	}
	
	public Article(int codi, float preuCost, float preuPublic, String nom){
		this.codi = codi;
		this.preuCost = preuCost;
		this.preuPublic = preuPublic;
		this.nom = nom;
	}
	
	public int getCodi(){return codi;}
	public float getPreuCost(){return preuCost;}
	public float getPreuPublic(){return preuPublic;}
	public String getNom(){return nom;}
	
	public void setCodi(int codi){this.codi = codi;}
	public void setPreuCost(float preuCost){this.preuCost = preuCost;}
	public void setPreuPublic(float preuPublic) {this.preuPublic = preuPublic;}
	public void setNom(String nom) {this.nom = nom;}
	
	@Override
	public String toString() {
		return "Article [codi=" + codi + ", nom=" + nom + ", preuCost=" + preuCost + ", preuPublic=" + preuPublic + "]";
	}

	public boolean equals(Object o){
		if(o instanceof Article){
			if(((Article) o).codi == this.codi){
				return true;
			}
			return false;
		}
		return false;
		//throw new IllegalArgumentException ("No és un article");
	}
	
	public float porcentatgeGanancia(){
		return 100*(preuPublic-preuCost)/preuCost;
	}
}
