package AuthentificationDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
	
	
	Connection cnx;//creer une cnx (lien) vers une base de donn�s
	Statement st;//pour envoyer et ex�cuter des requetes sql
	ResultSet rs;//r�cuperation des resultats
	public LoginDAO() {
		String chaine="jdbc:mysql://localhost:3306/test"; //url de base donn�s dont on veut utiliser
		
		
		try {
			//pilote en memoire
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargement avec succ�s");
		} catch (ClassNotFoundException e2) {
			System.out.println("prb de driver");
			e2.printStackTrace();
		}
	
		
	
	try {
		//.............................(url,"root","password si tu en a une"sinon "");
		cnx=DriverManager.getConnection(chaine,"root","");
		System.out.println("con avec succ�s");
	} catch (SQLException e1) {
		System.out.println("prb de cnx");
		e1.printStackTrace();
	}

}
	
public 	boolean login (String a, String b)
	{
		try {
			st=cnx.createStatement();
			rs = st.executeQuery("select password from user where login = '"+a+"'");
			if (rs.next())
		{
				if (b.equals(rs.getString("password")))
				{	System.out.println("succcceeeesssss");
				return true;}
				else return false;
		}
			else return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	
	
	
	
	
	
}
