package mounir1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AuthentificationDAO.Ajoutdao;

public class Ajoucontrol implements ActionListener{
Afficher A;
	public void actionPerformed(ActionEvent e) {

	Ajoutdao aj=new Ajoutdao();
	aj.login(A.nn.getText(), A.mm.getText(), Double.parseDouble(A.dd.getText()), Double.parseDouble(A.qq.getText()));
	System.out.println("success");	
	}
			
	
	
	
	public Ajoucontrol(Afficher ff )
	{A= ff;}
	

}
