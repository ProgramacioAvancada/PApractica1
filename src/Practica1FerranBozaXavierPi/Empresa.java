package Practica1FerranBozaXavierPi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Empresa {

	private Article[][] articles;
	private int qPropis;
	private int qAdicionals;
	private List<Integer> proveidors;

	public Empresa(int maxArticles) {
		articles = new Article[2][maxArticles];
		proveidors = new LinkedList<Integer>();
		qAdicionals = 0;
		qPropis = 0;
	}

	public Article[][] getArticles() {return articles;}
	public int getqPropis() {return qPropis;}
	public int getqAdicionals() {return qAdicionals;}
	public List<Integer> getProveidors() {return proveidors;}

	
	
	public boolean addArticle(Article art) {
		if (art instanceof Propi) {
			for(int i = 0; i < qPropis; i++){
				if(art.equals(articles[0][i])){
					throw new IllegalArgumentException("Ja esta lartice en qquetio");
				}
			}
			if (articles[0].length > qPropis + 1) {
				articles[0][qPropis] = art;
				qPropis++;
				
				return true;
			}else{
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		if (art instanceof Addicional){
			for(int i = 0; i < qAdicionals; i++){
				if(art.equals(articles[1][i])){
					throw new IllegalArgumentException("Ja esta lartice en qquetio");
				}
			}
			if (articles[1].length > qAdicionals + 1) {
				articles[1][qAdicionals] = art;
				qAdicionals++;
				((Addicional) art).getProveidor();
				return true;	
			}else{
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		return false;
		//throw new Exception();
		//ArrayIndexOutOfBoundsException

	}
	//afegeix un nou article al magatzem,
	//obligatòriament cal controlar mitjançant excepcions la repetició de
	// l’article a donar d’alta. Si l’article és subministrat o porta ingredients
	// subministrats per proveïdors que no estan al magatzem s’hi han d’afegir. 
	
	boolean remArticle (Article art){
		return false;
	}
	// operació contrària a l’anterior, en
	// aquest cas l’ha de donar de baixa. Si no hi és, s’ha de llançar una
	// excepció. No s’ha de fer la gestió amb els proveïdors de l’article a donar
	// de baixa. 
	
	public void llistatTotsArticles(){
		System.out.println("Articles propis: ");
		for(int i = 0 ; i < qPropis; i++){
			System.out.print(articles[0][i]);
		}
		System.out.println("Articles adicionals: ");
		for(int i = 0 ; i < qAdicionals; i++){
			System.out.print(articles[1][i]);
		}
	}
	// ha de generar un llistat ordenat a pantalla
	// de tots els articles de l’empresa, TOTS tan propis com addicionals.
	// L’ordenació ha de ser en funció del nom descriptiu de l’article i s’han
	//de visualitzar tots els atributs de cadascun dels articles (invocant al
	// mètode toString()). 
	
	public void millorBenefici(){
		
	} 
	// ha de generar un llistat a pantalla
	// dels 5 articles de l’empresa que generen un marge de benefici més
	//elevat.
	
	public boolean teArticle(int codi){
		
		for(int i = 0; i < qPropis; i++){
			if(articles[0][i].getCodi() == codi){
				return true;
			}
		}
		for(int i = 0; i < qAdicionals; i++){
			if(articles[1][i].getCodi() == codi){
				return true;
			}
		}
		return false;
	}
	// mitjançant una expressió booleana ha
	// determinar si l’article amb el codi especificat està al magatzem de
	// productes de l’empresa.
	
	public int quantsPropis(Ingredient ing){
		return 0;
	}
	// calcula el nombre d’articles propis que
	// porten l’ingredient especificat en el paràmetre.
	
	public int addProveïdor(int codi){
		return 0;
	} 
	//afegeix, si no existeix, el proveïdor al
	// magatzem. En cas contrari llança una excepció.
	
	public int remProveïdor(int codi){
		return 0;
	} 
	//elimina, si existeix, el proveïdor del
	// magatzem. En cas contrari llança una excepció.
	
	
	public Map<Integer,Integer> productesProveïdor(){
		return null;
		
	}
	/*el mètode ha de calcular
	per cada proveïdor el número de productes diferents que subministra a
	l’empresa, s’han de comptar tant els que són ingredients per elaborar
	productes propis com els de venda directa. Aquesta informació la de
	retornar en una col·lecció Map. */

	@Override
	public String toString() {
		return "Empresa [articles=" + Arrays.toString(articles) + ", qPropis=" + qPropis + ", qAdicionals="
				+ qAdicionals + ", proveidors=" + proveidors + "]";
	} 
	
}
