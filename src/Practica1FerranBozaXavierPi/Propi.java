package Practica1FerranBozaXavierPi;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Propi extends Article {

	private Node ingredients;

	public Propi(int codi, String nom) {
		super(codi, nom);
	}

	public Propi(int codi, float preuCost, float preuPublic, String nom) {
		super(codi, preuCost, preuPublic, nom);
	}

	public void visualitzarIngredients() {
		if (ingredients == null) {
			throw new IllegalArgumentException("No hi ha cap ingredients");
		}
		Node aux = ingredients;
		do {
			System.out.println(aux.getIngredient());
			aux = aux.getSeguent();
		} while (aux != null);
	}

	public void addIngredient(Ingredient ing, float quantitat) {
		if (ingredients == null) {
			ingredients.setIngredient(ing);
			ingredients.setQuantitat((int) quantitat);
		} else {
			boolean trobat = false;
			Node aux = ingredients;
			do {
				if (aux.getIngredient().equals(ing)) {
					trobat = true;
				}
				aux = aux.getSeguent();
			} while (aux != null && !trobat);
			if (trobat) {
				throw new IllegalArgumentException("Ingredient repetit");
			} else {
				Node n = new Node(ing, (int) quantitat);
				n.setSeguent(ingredients);
				ingredients = n;
			}
		}
	}

	public void remIngredient(Ingredient ing) {
		if (ingredients == null) {
			throw new IllegalArgumentException("No hi ha cap ingredients");
		}
		Node aux = ingredients;
		boolean trobat = false;
		if (aux.getIngredient().equals(ing)) {
			trobat = true;
			ingredients.setSeguent(ingredients.getSeguent());
		} else {
			while (aux.getSeguent() != null && !trobat) {
				if (aux.getSeguent().getIngredient().equals(ing)) {
					trobat = true;
					aux.setSeguent(aux.getSeguent().getSeguent());
				}
				aux = aux.getSeguent();
			}
			if (!trobat) {
				throw new IllegalArgumentException("No hi ha l'ingredient demanat");
			}
		}
	}

	public boolean teIngredient(Ingredient ing) {
		if (ingredients == null) {
			throw new IllegalArgumentException("No hi ha cap ingredients");
		} else {
			Node aux = ingredients;
			do {
				if (aux.getIngredient().equals(ing)) {
					return true;
				}
				aux = aux.getSeguent();
			} while (aux != null);
			return false;
		}
	}

	public void augmentarQuantitat(int unitats) {
		if (ingredients == null) {
			throw new IllegalArgumentException("No hi ha cap ingredients");
		} else {
			Node aux = ingredients;
			do {
				if (aux.getQuantitat() < 10) {
					aux.setQuantitat(aux.getQuantitat() + unitats);
				}
				aux = aux.getSeguent();
			} while (aux != null);
		}
	}

	public void eliminarIngredients() {
		if (ingredients == null) {
			throw new IllegalArgumentException("No hi ha cap ingredient");
		}
		Node aux = ingredients.getSeguent();
		if (aux == null) {
			throw new IllegalArgumentException("Només hi ha un ingredient");
		}
		Node n1;
		Node n2;
		if (ingredients.getQuantitat() > aux.getQuantitat()) {
			n1 = aux;
			n2 = ingredients;
		} else {
			n1 = ingredients;
			n2 = aux;
		}
		aux = aux.getSeguent();
		do {
			if (aux.getQuantitat() < n2.getQuantitat()) {
				if (aux.getQuantitat() < n1.getQuantitat()) {
					n2 = n1;
					n1 = aux;
				} else {
					n2 = aux;
				}
			}

		} while (aux != null);
		this.remIngredient(n1.getIngredient());
		this.remIngredient(n2.getIngredient());
	}
	// ha de donar de baixa els 2 ingredients que apareixen en menor quantitat.
	// Si l’article només té un ingredient s’ha de llançar una excepció.

	public void ingredientsMesQuantitat() {
		if (this.ingredients.getSeguent().getIngredient() == null) {
			throw new IllegalArgumentException("No té almenys 3 ingredients");
		}
		Node aux = ingredients;
		SortedSet <Node> nodeSet = new TreeSet <Node>();
		while(aux != null){
			nodeSet.add(aux);
			aux = aux.getSeguent();
		}
		for(int i = 0; i < 3; i++){
			System.out.println(nodeSet.last());
			nodeSet.remove(nodeSet.last());
		}
	}
	// visualitza a pantalla tots els atributs dels 3 ingredients que formen
	// l’article propi que apareixen en una proporció més elevada. Si l’article
	// té
	// menys de 3 ingredients el mètode llançarà una excepció.

	@Override
	public String toString() {
		return "Propi [ingredients=" + ingredients + ", getCodi()=" + getCodi() + ", getNom()=" + getNom()
				+ ", getPreuCost()=" + getPreuCost() + ", getPreuPublic()=" + getPreuPublic() + "]";
	}

}

class Node implements Comparable{

	private Ingredient i;
	private int q;
	private Node seg;

	public Node(Ingredient i, int q) {
		this(i, q, null);
	}

	public Node(Ingredient i, int q, Node n) {
		this.i = i;
		this.q = q;
		seg = n;
	}

	public Ingredient getIngredient() {
		return i;
	}

	public int getQuantitat() {
		return q;
	}

	public Node getSeguent() {
		return seg;
	}

	public void setIngredient(Ingredient i) {
		this.i = i;
	}

	public void setQuantitat(int q) {
		this.q = q;
	}

	public void setSeguent(Node seg) {
		this.seg = seg;
	}
	
	public boolean equals (Object n){
		if(n instanceof Node){
			if(((Node) n).getIngredient().equals(this.getIngredient())){
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public int compareTo(Object n) {
		if(n instanceof Node){
			if(this.getQuantitat() > ((Node)n).getQuantitat()){
				return 1;
			}
			else{
				return -1;
			}
		}
		else{
			throw new IllegalArgumentException("No és un node");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}