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

	public void addIngredient(Ingredient ing, float quantitat) throws Exception {
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
				throw new Exception("Ingredient repetit");
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

	public void eliminarIngredients() throws Exception {// a mitjas

		if (ingredients == null) {
			throw new Exception("No hi ha cap ingredient");
		}
		Node aux = ingredients.getSeguent();
		if (aux == null) {
			throw new Exception("Només hi ha un ingredient");
		}

		Node n1 = ingredients;
		Node n2 = aux;

		if (n1.getQuantitat() > n2.getQuantitat()) {
			n1 = aux;
			n2 = ingredients;
		}

		aux = aux.getSeguent();

		while (aux != null) {
			if (aux.getQuantitat() < n2.getQuantitat()) {
				if (aux.getQuantitat() < n1.getQuantitat()) {
					n2 = n1;
					n1 = aux;
				}
				n2 = aux;
			}
		}

		remIngredient(n1.getIngredient());
		remIngredient(n2.getIngredient());
		// ha de donar de baixa els 2 ingredients que apareixen en menor
		// quantitat.
		// Si l’article només té un ingredient s’ha de llançar una excepció.
	}

	public void ingredientsMesQuantitat() throws Exception {

		SortedSet<Node> llista = new TreeSet<Node>();
		
		Node aux = ingredients;
		
		while(aux != null){
			llista.add(aux);
			aux = aux.getSeguent();
		}
		
		if(llista.size()<3){
			throw new Exception("te menys de 3 ingredients");
		}
		
		
		for(int i = 0; i<3; i++){
			System.out.println(llista.last());
			llista.remove(llista.last());
		}
		
		// visualitza a pantalla tots els atributs dels 3 ingredients que formen
		// l’article propi que apareixen en una proporció més elevada. Si l’article
		// té
		// menys de 3 ingredients el mètode llançarà una excepció.
	}

	public Set<Ingredient> getIngredients() {

		Set<Ingredient> setIng = new TreeSet<Ingredient>();

		Node aux = ingredients;

		while (aux != null) {
			setIng.add(aux.getIngredient());
			aux = aux.getSeguent();
		}
		return setIng;
	}
	
	

	@Override
	public String toString() {
		return "Propi [ingredients=" + ingredients + ", getCodi()=" + getCodi() + ", getNom()=" + getNom()
				+ ", getPreuCost()=" + getPreuCost() + ", getPreuPublic()=" + getPreuPublic() + "]";
	}

	private class Node implements Comparable<Node>{

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

		@Override
		public int compareTo(Node o) {
			if(this.getQuantitat()<o.getQuantitat())
				return -1;
			if(this.getQuantitat()>o.getQuantitat())
				return 1;
			return 0;
		}
		
		public boolean equals(Object o){
			return this.getIngredient().equals(((Node)o).getIngredient());
			
		}

	}
}
