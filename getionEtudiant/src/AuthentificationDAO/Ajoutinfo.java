package AuthentificationDAO;


import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ajoutinfo extends JFrame {
	
	public Ajoutinfo() {
		
		setTitle("My Personnal data");
		setBounds(50, 50, 400, 500);
		JLabel n=new JLabel("nom");
		JLabel m=new JLabel("Prenom");
		JLabel d=new JLabel("note");
		JLabel q=new JLabel("notemoyenne");
		JButton su=new JButton("submit");
		n.setBounds(30, 60, 100, 60);
		m.setBounds(30, 100, 100, 60);
		d.setBounds(30, 140, 100, 60);
		q.setBounds(30, 180, 100, 60);
		JTextField nn=new JTextField();
		JTextField mm=new JTextField();
		JTextField dd=new JTextField();
		JTextField qq=new JTextField();
		nn.setBounds(130, 80, 80, 20);
		mm.setBounds(130, 120, 80, 20);
		dd.setBounds(130, 160, 80, 20);
		qq.setBounds(130, 200, 80, 20);
		su.setBounds(200, 240, 100, 20);
		getContentPane().add(n);
		getContentPane().add(m);
		getContentPane().add(d);
		getContentPane().add(q);
		getContentPane().add(nn);
		getContentPane().add(mm);
		getContentPane().add(dd);
		getContentPane().add(qq);
		getContentPane().add(su);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		 setVisible(true);
		
		
	
	}
	
	
	
	
	
}
  
