package prova;

import Practica1FerranBozaXavierPi.*;

public class test {

	public static void main(String[] args) {
		
		
		Empresa pato = new Empresa(10);
		
		try {
			
			pato.addArticle(new Postres(0, 1, 3, "Fresas con nata", "Nestle", 0, false, false));
			pato.addArticle(new Postres(1, 5, 25, "Rico Brownie", "Nestle", 0, false, true));
			pato.addArticle(new Pizza(2, 2, 3, "Me da igual con piña", 2));
			pato.addArticle(new Pizza(3, 2, 4, "Barbacoa vegetal", 2));
			pato.addArticle(new Pizza(4, 2, 5, "Hawaiana sin piña", 0));
			pato.addArticle(new Entrepa(5, 3, 5, "Entrepà amb pà", 3, false));
			pato.addArticle(new Entrepa(6, 3, 5, "Entrepà de jamó duls", 4, false));
			pato.addArticle(new Entrepa(7, "Entrepà yo k se no zoi 100tifico", 3, false));
			pato.addArticle(new Beguda(8, "CocaPepsi", "Del botello", 0, false, true));
			pato.addArticle(new Beguda(9, 1, 2, "cocacola con agua del mcdonals", "magdalena", 1, false, true));
			pato.addArticle(new Beguda(10, 1, 100, "rico pis", "que me deje", 2, false, true));
			pato.addArticle(new Beguda(11, 10, 11, "agua del grifo", "Hacendado", 5, false, true));
			pato.addArticle(new Beguda(11, 10, 11, "agua del grifo", "Hacendado", 5, false, true));//repetido
			pato.addArticle(new Entrepa(5, 3, 5, "Entrepà amb pà", 3, false));
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
		pato.llistatTotsArticles();
		
		try {
			pato.millorBenefici();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(pato.teArticle(codi))
		

	}

}
