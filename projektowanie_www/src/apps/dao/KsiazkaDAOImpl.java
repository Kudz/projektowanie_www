package apps.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import apps.model.Autor;
import apps.model.Ksiazka;
import apps.model.Kategoria;

public class KsiazkaDAOImpl implements KsiazkaDAO {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException ex){

		}
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/ksiazki?useSSL=false", "java", "java");
	}
	
	private void closeConnection(Connection polaczenie) {
		
		if(polaczenie == null)
		{
			return;
		}
		try {
			polaczenie.close();
		} catch(SQLException ex) {
			
		}
	}
	
	@Override
	public List<Ksiazka> znajdzWszystkieKsiazki() {
		
		List<Ksiazka> wynik = new ArrayList<>();
		List<Autor> listaAutorow = new ArrayList<>();
		
		String sql = "select * from ksiazka inner join autor on ksiazka.id = autor.id_ksiazki";
		
		Connection polaczenie = null;
		
		try {
			polaczenie = getConnection();
			PreparedStatement statement = polaczenie.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) 
			{
				Ksiazka ksiazka = new Ksiazka();
				Autor autor = new Autor();
				ksiazka.setId(resultSet.getLong("id"));
				ksiazka.setTytul_ksiazki(resultSet.getString("tytul_ksiazki"));
				ksiazka.setId_kategorii(resultSet.getLong("id_kategorii"));
				autor.setId_ksiazki(resultSet.getLong("id_ksiazki"));
				autor.setImie(resultSet.getString("imie"));
				autor.setNazwisko(resultSet.getString("nazwisko"));
				listaAutorow.add(autor);
				ksiazka.setAutorzy(listaAutorow);
				ksiazka.setWydawca(resultSet.getString("wydawca"));
				wynik.add(ksiazka);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(polaczenie);
		}
		
		return wynik;
	}

	@Override
	public List<Ksiazka> znajdzKsiazkiPoKluczu(String Klucz) {
		
		List<Ksiazka> wynik = new ArrayList<>();
		List<Autor> listaAutorow = new ArrayList<>();
		
	//	String sql = "select * from ksiazka inner join autor on ksiazka.id = autor.id_ksiazki" + " where tytul_ksiazki like '" + Klucz.trim() + "';";

		String sql = "select * from ksiazka inner join autor on ksiazka.id = autor.id_ksiazki where tytul_ksiazki like '%" + Klucz.trim() + "%'" + " or imie like '%" + Klucz.trim() + "%'" + " or nazwisko like '%" + Klucz.trim() + "%'";
		
		Connection polaczenie = null;
		
		try {
			polaczenie = getConnection();
			PreparedStatement statement = polaczenie.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) 
			{
				Ksiazka ksiazka = new Ksiazka();
				Autor autor = new Autor();
				ksiazka.setId(resultSet.getLong("id"));
				ksiazka.setTytul_ksiazki(resultSet.getString("tytul_ksiazki"));
				ksiazka.setId_kategorii(resultSet.getLong("id_kategorii"));
				autor.setId_ksiazki(resultSet.getLong("id_ksiazki"));
				autor.setImie(resultSet.getString("imie"));
				autor.setNazwisko(resultSet.getString("nazwisko"));
				listaAutorow.add(autor);
				ksiazka.setAutorzy(listaAutorow);
				ksiazka.setWydawca(resultSet.getString("wydawca"));
				wynik.add(ksiazka);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(polaczenie);
		}
		
		return wynik;
	}

	@Override
	public List<Kategoria> znajdzWszystkieKategorie() {

		List<Kategoria> wynik = new ArrayList<>();
		
		String sql = "select * from kategoria";
		
		Connection polaczenie = null;
		
		try {
			polaczenie = getConnection();
			PreparedStatement statement = polaczenie.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) 
			{
				Kategoria kategoria = new Kategoria();
				kategoria.setId(resultSet.getLong("id"));
				kategoria.setOpis_kategorii(resultSet.getString("opis_kategorii"));
				wynik.add(kategoria);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(polaczenie);
		}
		
		return wynik;
	}

	@Override
	public void wstaw(Ksiazka ksiazka) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aktualizuj(Ksiazka ksiazka) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skasuj(Long idKsiazki) {
		// TODO Auto-generated method stub
		
	}

	
}
