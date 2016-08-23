package apps.dao;

import java.util.List;

import apps.model.Ksiazka;
import apps.model.Kategoria;

public interface KsiazkaDAO {

	public List<Ksiazka>znajdzWszystkieKsiazki();
	
	public List<Ksiazka>znajdzKsiazkiPoKluczu(String Klucz);
	
	public List<Kategoria>znajdzWszystkieKategorie();
	
	public void wstaw(Ksiazka ksiazka);
	
	public void aktualizuj(Ksiazka ksiazka);
	
	public void skasuj(Long idKsiazki);
}
