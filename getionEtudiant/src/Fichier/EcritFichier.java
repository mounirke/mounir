package Fichier;

import java.io.FileOutputStream;
import java.io.IOException;

public class EcritFichier {

	static public void main (String args [])

	{

	String Chaine = "Bonjour les GE te les GI" ;

	try {

	FileOutputStream f = new FileOutputStream ("c:/note/note.txt") ;

	f.write (Chaine.getBytes ()) ;

	f.close () ;

	} catch (IOException e)

	{

	System.err.println ("Erreur ecriture") ;

	}
	
}
	
}
