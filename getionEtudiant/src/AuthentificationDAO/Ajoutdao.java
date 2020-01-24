package AuthentificationDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ajoutdao {
	
	Connection cnx;
	Statement st;
	ResultSet rs;
	
	public  Ajoutdao()
	{
		String chaine= "jdbc:mysql://localhost:3306/test";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Chargement avec succès");
		} catch (ClassNotFoundException e1) {
		System.out.println("Problème driver");
		e1.printStackTrace();
		}
		try {
		cnx = DriverManager.getConnection(chaine,"root","");
		System.out.println("Cnx avec succès");
		} catch (SQLException e1) {
		System.out.println("pb de cnx");
		e1.printStackTrace();
		}
	}
		public boolean login(String a, String b,double n,double m) {
		try {	
		
		st = cnx.createStatement();
		String requete = ("insert into etudiant(nom,prenom,note,notemoyenne) values('"+a+"','"+b+"',"+n+","+m+")");
        st.executeUpdate(requete);
       System.out.println("enregistrement avec succes ");
		
		}
		catch (SQLException e) {
			System.out.println("Problème driver");
			e.printStackTrace();
			}
		return false;
		}
}
