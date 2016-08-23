package apps.model;

import java.util.List;

public class Ksiazka {
	
	private Long id;
	private Long id_kategorii;
	private String tytul_ksiazki;
	private List<Autor> autorzy;
	private String wydawca;

	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public Long getId_kategorii()
	{
		return id_kategorii;
	}
	
	public void setId_kategorii(Long id_kategorii)
	{
		this.id_kategorii = id_kategorii;
	}
	
	public String getTytul_ksiazki()
	{
		return tytul_ksiazki;
	}
	
	public void setTytul_ksiazki(String tytul_ksiazki)
	{
		this.tytul_ksiazki = tytul_ksiazki;
	}
	
	public List<Autor> getAutorzy()
	{
		return autorzy;
	}
	
	public void setAutorzy(List<Autor> autorzy)
	{
		this.autorzy = autorzy;
	}
	
	public String getWydawca()
	{
		return wydawca;
	}
	
	public void setWydawca(String wydawca)
	{
		this.wydawca = wydawca;
	}
	
	public String toString()
	{
		return "Ksi¹¿ka - Identyfikator: " + id + ", Tytu³ ksi¹¿ki: " + tytul_ksiazki;
	}
}
