package Practica1FerranBozaXavierPi;

public class Propi extends Article {
	
	private Node ingredients;

	public Propi(int codi, String nom) {
		super(codi, nom);
		// TODO Auto-generated constructor stub
	}
	
	public Propi(int codi, float preuCost, float preuPublic, String nom) {
		super(codi, preuCost, preuPublic, nom);
		// TODO Auto-generated constructor stub
	}

	public Node getIngredients() {
		//esta mal
		return ingredients;
	}

	
	
	
	public void visualitzarIngredients(){
		
	} 
	//llistat a pantalla de tots els ingredients
	 // que composen l’article propi.
	
	 public void addIngredient(Ingredient ing, float quantitat){
		 
	 } 
	 // afegeix un nou ingredient al
	 // magatzem. Obligatòriament cal controlar mitjançant excepcions la
	 // repetició d’ingredient. El segon paràmetre en indica la quantitat.
	 
	 public void remIngredient(Ingredient ing){
		 
	 } 
	 // operació contrària a l’anterior.
	 
	 public boolean teIngredient(Ingredient ing){
		 return true;
	 } 
	 //determina si l’ ingredient especificat
	 // en el paràmetre forma o no part de l’article.
	 
	public void augmentarQuantitat(int unitats){
		
	}
	// ha d’augmentar la quantitat en tantes unitats com les especificades al
	// paràmetre de tots els ingredients de l’article que estan en una quantitat
	// inferir a 10 unitats.
	
	public void eliminarIngredients(){
		
	}
	// ha de donar de baixa els 2 ingredients que apareixen en menor quantitat.
	// Si l’article només té un ingredient s’ha de llançar una excepció.
	
	public void ingredientsMesQuantitat(){
		
	}
	// visualitza a pantalla tots els atributs dels 3 ingredients que formen
	// l’article propi que apareixen en una proporció més elevada. Si l’article té
	// menys de 3 ingredients el mètode llançarà una excepció. 
	
	
	@Override
	public String toString() {
		return "Propi [ingredients=" + ingredients + ", getCodi()=" + getCodi() + ", getNom()=" + getNom()
				+ ", getPreuCost()=" + getPreuCost() + ", getPreuPublic()=" + getPreuPublic() + "]";
	}
	
}

class Node{
	
	private Ingredient i;
	private int q;
	private Node seg;


	public Node(Ingredient i, int q){
		this(i, q, null);
	}
	
	public Node(Ingredient i, int q, Node n){
		this.i = i;
		this.q = q;
		seg=n;
	}

	public Ingredient getIngredient() {return i;}
	public int getQuantitat() {return q;}
	public Node getSeguent() {return seg;}

	public void setIngredient(Ingredient i) {this.i = i;}
	public void setQuantitat(int q) {this.q = q;}
	public void setSeguent(Node seg) {this.seg = seg;}
	
}