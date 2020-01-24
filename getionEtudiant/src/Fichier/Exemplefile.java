package Fichier;

import java.io.File;

public class Exemplefile {
	

		private static void listeFichier (File dir){

		if (dir.isDirectory () == true){

		String fichiers [ ] = dir.list () ;

		System.out.println(dir.getAbsolutePath()+":");

		for (int i = 0 ; i != fichiers.length ; i++) {

		System.out.println("\t"+fichiers[i]);

		}

		} else{ System.err.println (dir + " n'est pas un repertoire") ; }
		
		}
		static public void main (String args [ ]) {

			File f=new File("C:\\Users\\hp\\Desktop\\jalil");

			listeFichier(f);
//			Classun c1= new Classun();
//			Classdeux c2= new Classdeux();
//			c1.afficher();
//			c2.afficher();

		}

		
}
