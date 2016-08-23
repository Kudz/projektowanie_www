package apps.model;

public class Autor {

	private Long id;
	private Long id_ksiazki;
	private String imie;
	private String nazwisko;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public Long getId_ksiazki()
	{
		return id_ksiazki;
	}
	
	public void setId_ksiazki(Long id_ksiazki)
	{
		this.id_ksiazki = id_ksiazki;
	}
	
	public String getImie()
	{
		return imie;
	}
	
	public void setImie(String imie)
	{
		this.imie = imie;
	}
	
	public String getNazwisko()
	{
		return nazwisko;
	}
	
	public void setNazwisko(String nazwisko)
	{
		this.nazwisko = nazwisko;
	}
	
	public String toString()
	{
		return "Autor - Identyfikator: " + id + ", Ksi¹¿ka - Identyfikator: " + id_ksiazki + ", Imiê: " + imie + ", Nazwisko: " + nazwisko;
	}
}
