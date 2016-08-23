package apps.klient;

import java.util.List;

import apps.dao.KsiazkaDAO;
import apps.dao.KsiazkaDAOImpl;
import apps.model.Ksiazka;

public class KsiazkaApp {
 
	private static KsiazkaDAO ksiazkaDAO = new KsiazkaDAOImpl();
	
	public static void main(String[] args)
	{
	//	System.err.println("Lista Wszystkich Ksi嘀ek:");
		System.out.println("Lista Wszystkich Ksi嘀ek:");
		znajdzWszystkieKsiazki();
		System.out.println();
		
	//	System.err.println("Wyszukiwanie ksi嘀ek ze s這wem kluczowym 'Groovy' w tytule:");
		System.out.println("Wyszukiwanie ksi嘀ek ze s這wem kluczowym 'Groovy' w tytule:");
		znajdzKsiazkiPoKluczu("Groovy");
		System.out.println(); 
		
	//	System.err.println("Wyszukiwanie ksi嘀ek ze s這wem kluczowym 'Josh' dla imienia autora:");
		System.out.println("Wyszukiwanie ksi嘀ek ze s這wem kluczowym 'Josh' dla imienia autora:");
		znajdzKsiazkiPoKluczu("Josh");
		System.out.println(); 
	}
	
	private static void znajdzWszystkieKsiazki()
	{
		List<Ksiazka> ksiazki = ksiazkaDAO.znajdzWszystkieKsiazki();
		for (Ksiazka ksiazka : ksiazki)
		{
			System.out.println(ksiazka);
		}
	}

	private static void znajdzKsiazkiPoKluczu(String klucz)
	{
		List<Ksiazka> ksiazki = ksiazkaDAO.znajdzKsiazkiPoKluczu(klucz);
		for (Ksiazka ksiazka : ksiazki)
		{
			System.out.println(ksiazka);
		}
	}
}
