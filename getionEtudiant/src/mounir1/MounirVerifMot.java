package mounir1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MounirVerifMot {

Connection cnx;
Statement st;
ResultSet rs;

        public MounirVerifMot()
{
             String chaine= "jdbc:mysql://localhost:3306/test";
try {
                  Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("Chargement avec succ�s");
}                      catch (ClassNotFoundException e1) {
                       System.out.println("Probl�me driver");
                        e1.printStackTrace();
}
                               try {
                        cnx = DriverManager.getConnection(chaine,"root","");
                        System.out.println("Cnx avec succ�s");
}                       catch (SQLException e1) {
                        System.out.println("pb de cnx");
                        e1.printStackTrace();
}
}
            public String login(String a, String pw)
{            String requete = "select * from user where login ='"+a+"'";
              try {
               st = cnx.createStatement();
               rs = st.executeQuery(requete);

                  if (rs.next()){
                   if(pw.equals(rs.getString(2)))
                     return "correct";
                     else return "hello";
}
                        else return "hello";
}                       catch (SQLException e) {

                      e.printStackTrace();
                       return "hello";

}



}

}	


