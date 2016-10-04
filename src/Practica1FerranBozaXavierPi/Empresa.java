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
	//obligat�riament cal controlar mitjan�ant excepcions la repetici� de
	// l�article a donar d�alta. Si l�article �s subministrat o porta ingredients
	// subministrats per prove�dors que no estan al magatzem s�hi han d�afegir. 
	
	boolean remArticle (Article art){
		return false;
	}
	// operaci� contr�ria a l�anterior, en
	// aquest cas l�ha de donar de baixa. Si no hi �s, s�ha de llan�ar una
	// excepci�. No s�ha de fer la gesti� amb els prove�dors de l�article a donar
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
	// de tots els articles de l�empresa, TOTS tan propis com addicionals.
	// L�ordenaci� ha de ser en funci� del nom descriptiu de l�article i s�han
	//de visualitzar tots els atributs de cadascun dels articles (invocant al
	// m�tode toString()). 
	
	public void millorBenefici(){
		
	} 
	// ha de generar un llistat a pantalla
	// dels 5 articles de l�empresa que generen un marge de benefici m�s
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
	// mitjan�ant una expressi� booleana ha
	// determinar si l�article amb el codi especificat est� al magatzem de
	// productes de l�empresa.
	
	public int quantsPropis(Ingredient ing){
		return 0;
	}
	// calcula el nombre d�articles propis que
	// porten l�ingredient especificat en el par�metre.
	
	public int addProve�dor(int codi){
		return 0;
	} 
	//afegeix, si no existeix, el prove�dor al
	// magatzem. En cas contrari llan�a una excepci�.
	
	public int remProve�dor(int codi){
		return 0;
	} 
	//elimina, si existeix, el prove�dor del
	// magatzem. En cas contrari llan�a una excepci�.
	
	
	public Map<Integer,Integer> productesProve�dor(){
		return null;
		
	}
	/*el m�tode ha de calcular
	per cada prove�dor el n�mero de productes diferents que subministra a
	l�empresa, s�han de comptar tant els que s�n ingredients per elaborar
	productes propis com els de venda directa. Aquesta informaci� la de
	retornar en una col�lecci� Map. */

	@Override
	public String toString() {
		return "Empresa [articles=" + Arrays.toString(articles) + ", qPropis=" + qPropis + ", qAdicionals="
				+ qAdicionals + ", proveidors=" + proveidors + "]";
	} 
	
}
