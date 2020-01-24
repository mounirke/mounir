package Présentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AuthentificationDAO.Ajoutinfo;
import AuthentificationDAO.LoginDAO;

public class Mounir implements ActionListener{
	
	Yassine yas;
public  Mounir(Yassine e) {
	// TODO Auto-generated constructor stub

yas = e;

}
	
	public void actionPerformed(ActionEvent e) {
System.out.println("salut mounir" +yas.login.getText());

LoginDAO   p  = new LoginDAO();
if(p.login(yas.login.getText(),new String( yas.pw.getPassword()))) {
	 Ajoutinfo pop = new Ajoutinfo();
		
	
}
}

}
