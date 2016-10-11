package Practica1FerranBozaXavierPi;

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
					aux.setQuantitat(aux.getQuantitat()+unitats);
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
		else {
			Node n1 = ingredients;
			Node n2 = aux;
			do {
				if (aux.getQuantitat() < 10) {
					aux.setQuantitat(aux.getQuantitat());
				}
				aux = aux.getSeguent();
			} while (aux != null);
		}
	}
	// ha de donar de baixa els 2 ingredients que apareixen en menor quantitat.
	// Si l’article només té un ingredient s’ha de llançar una excepció.

	public void ingredientsMesQuantitat() {

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

class Node {

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

}