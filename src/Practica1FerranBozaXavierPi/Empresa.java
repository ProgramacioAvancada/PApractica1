package Practica1FerranBozaXavierPi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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

	
	
	public boolean addArticle(Article art) throws Exception {
		/*
		if(art instanceof Article){
			if(teArticle(art.getCodi())){
				try{
					throw new Exception("Ja cont� aquest article");
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
		else{
			try{
				throw new Exception("No �s un article");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		if (art instanceof Propi) {
			if (articles[0].length > qPropis + 1) {
				articles[0][qPropis] = art;
				qPropis++;
				return true;
			}
		} else {
			if (articles[0].length > qAdicionals + 1) {
				articles[1][qAdicionals] = art;
				qAdicionals++;
				return true;
				
			}
		}
		if(art instanceof Addicional){
			if(!proveidors.contains(((Addicional)art).getProveidor())){
				proveidors.add(((Addicional)art).getProveidor());
			}
			// si un ingrediente esta subministrado por un proveidor que no esta hay que a�adirlo
		}
		return false;
		*/
		
		
		if(teArticle(art.getCodi())){
				throw new Exception("Ja cont� aquest article");
		}
		
		if (art instanceof Propi) {
			if (articles[0].length > qPropis) {
				articles[0][qPropis] = art;
				qPropis++;
				
				//es te que afagir tots el proveidors dels ingredients?
				return true;
			}
		} 
		if(art instanceof Addicional){
			if (articles[1].length > qAdicionals) {
				articles[1][qAdicionals] = art;
				qAdicionals++;
				if(!proveidors.contains(((Addicional)art).getProveidor())){
					proveidors.add(((Addicional)art).getProveidor());
				}
				return true;
			}
		}
		
		return false;
	}
	
	//afegeix un nou article al magatzem,
	//obligat�riament cal controlar mitjan�ant excepcions la repetici� de
	// l�article a donar d�alta. Si l�article �s subministrat o porta ingredients
	// subministrats per prove�dors que no estan al magatzem s�hi han d�afegir. 
	
	boolean remArticle (Article art){
		
		for (int i = 0; i < qPropis-1; i++) {
			if(art.equals(o))
		}
		for (int i = 0; i < qAdicionals-1; i++) {
			
		}
		return false;
	}
	// operaci� contr�ria a l�anterior, en
	// aquest cas l�ha de donar de baixa. Si no hi �s, s�ha de llan�ar una
	// excepci�. No s�ha de fer la gesti� amb els prove�dors de l�article a donar
	// de baixa. 
	
	public void llistatTotsArticles(){  //no ordenats
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
	
	public void millorBenefici() throws Exception{
		/*
		List <Article> articlesOrdenats = new LinkedList<Article>();
		for(int i = 0; i < 2; i++){
			for(int article = 0; article < articles[i].length && articles[i][article] != null; article++){
				if(articlesOrdenats.size() >= 5){
					articlesOrdenats.add(articles[i][article]);
				}
				else{
					boolean trobat = false;
					Article a;
					Iterator it;
					it = articlesOrdenats.iterator();
					while(it.hasNext() && !trobat){
						a = (Article)it.next();
						if(articles[i][article].porcentatgeGanancia() > a.porcentatgeGanancia()){
							it.remove();
							articlesOrdenats.add(articles[i][article]);
							trobat = true;
						}
					}
				}
			}
		}
		if(articlesOrdenats.size() > 5){
			try{
				throw new Exception("no hi ha com a minim 5 articles");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println("Els 5 articles que generen un marge de benefici m�s gran:");
		Article a;
		Iterator it;
		it = articlesOrdenats.iterator();
		while(it.hasNext()){
			a = (Article)it.next();
			System.out.println(a);
		}
		*/
		
		
		List <Article> articlesOrdenats = new LinkedList<Article>();
		
		for(int i = 0; i < 2; i++){
			for(int article = 0; article < articles[i].length && articles[i][article] != null; article++){
				
			}
			
		}
		
		
		
		
	} 
	// ha de generar un llistat a pantalla
	// dels 5 articles de l�empresa que generen un marge de benefici m�s
	//elevat.
	
	public boolean teArticle(int codi){
		/*
		for(int i = 0; i < 2; i++){
			for(int article = 0; article < articles[i].length && articles[i][article] != null; article++){
				if(articles[i][article].getCodi() == codi){
					return true;
				}
			}
		}
		*/
		
		
		for (int i = 0; i < qPropis-1; i++) {
			if(articles[0][i].getCodi()==codi){
				return true;
			}
		}
		for (int i = 0; i < qAdicionals-1; i++) {
			if(articles[1][i].getCodi()==codi){
				return true;
			}
		}
		
		return false;
	}
	// mitjan�ant una expressi� booleana ha
	// determinar si l�article amb el codi especificat est� al magatzem de
	// productes de l�empresa.
	
	public int quantsPropis(Ingredient ing){
		int cont = 0;
		for(int article = 0; article < qPropis-1; article++){
			if(((Propi)articles[0][article]).teIngredient(ing)){
				cont++;
			}
		}
		return cont;
	}
	// calcula el nombre d�articles propis que
	// porten l�ingredient especificat en el par�metre.
	
	public void addProve�dor(int codi) throws Exception{
		if(proveidors.contains(codi)){
			throw new Exception("ja existeix aquest prove�dor en l'empresa");
		}else{
			proveidors.add(codi);
		}
	} 
	//afegeix, si no existeix, el prove�dor al
	// magatzem. En cas contrari llan�a una excepci�.
	
	public void remProve�dor(int codi) throws Exception{
		if(proveidors.contains(codi)){
			proveidors.remove(codi);
		}else{
			throw new Exception("no existeix aquest prove�dor en l'empresa");
		}
	} 
	//elimina, si existeix, el prove�dor del
	// magatzem. En cas contrari llan�a una excepci�.
	public Map<Integer,Integer> productesProve�dor(){
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		
		
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
