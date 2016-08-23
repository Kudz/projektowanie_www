package apps.model;

public class Kategoria {

	private Long id;
	private String opis_kategorii;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getOpis_kategorii()
	{
		return opis_kategorii;
	}
	
	public void setOpis_kategorii(String opis_kategorii)
	{
		this.opis_kategorii = opis_kategorii;
	}
	
	public String toString()
	{
		return "Kategoria - Identyfikator: " + id + ", Opis kategorii: " + opis_kategorii;
	}
}
