package Practica1FerranBozaXavierPi;

import java.util.LinkedList;
import java.util.List;

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

	public Article[][] getArticles() {
		return articles;
	}

	public int getqPropis() {
		return qPropis;
	}

	public int getqAdicionals() {
		return qAdicionals;
	}

	public List<Integer> getProveidors() {
		return proveidors;
	}

	public boolean addArticle(Article art) {
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
				
				//TODO1: hshffas;
				
			}
		}
		return false;
		//throw new Exception();

	}
	
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
	
	public void millorBenefici(){
		
	}

}
