package Fichier;
	import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
	
public class LitFichier {
	

		public static void main (String args [])

		{

		try {

		InputStream s = new FileInputStream (" c:/note/note.txt ") ;

		byte buffer [ ] = new byte [s.available()] ;

		s.read (buffer) ;

		for (int i = 0 ; i != buffer.length ; i++)

		System.out.print ( (char) buffer [i]) ;

		s.close () ;

		} catch (IOException e)

		{

		System.err.println ("Erreur lecture") ;

		}
		
		
		
		}	
		
	}

	
	
	
	
	
	
	
	


