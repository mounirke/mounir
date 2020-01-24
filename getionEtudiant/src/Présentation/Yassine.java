package Présentation;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Yassine extends JFrame {
public 	JTextField login=new JTextField();
public JPasswordField pw;
		public Yassine() {
			
			setTitle("My first application");
			setBounds(50, 50, 400, 300);
			JButton b1=new JButton("OK");
			b1.setBounds(200, 180, 100, 20);
			JButton annuler=new JButton("annuler");
			annuler.setBounds(200, 215, 100, 20);
			JLabel l1=new JLabel("Login");
			l1.setBounds(30, 90, 100, 60);
			JLabel l2=new JLabel("Mot de passe");
			l2.setBounds(30, 130, 100,60);
			login.setBounds(130, 110, 100, 20);
			pw =new JPasswordField();
			pw.setBounds(130, 150, 100, 20);
			
			getContentPane().add(l1);
			getContentPane().add(login);
			getContentPane().add(pw);
			getContentPane().add(l2);
			getContentPane().add(b1);
			getContentPane().add(annuler);
			getContentPane().setLayout(null);
			//creation de la barre de menu
			 JMenuBar menubar =new JMenuBar();
			//creation des menus
			JMenu test1= new JMenu("Fichier");
			JMenu test2=new JMenu("Edition");
			JMenu test3= new JMenu("Source");
			JMenu test4=new JMenu("Help");
			//creation des sous menus 
			JMenuItem item1=new JMenuItem("New");
			JMenuItem item2=new JMenuItem("Ouvrir");
			JMenuItem item3=new JMenuItem("copier");
			JMenuItem item4=new JMenuItem("coller");
			
			//ajout
			test1.add(item1); 
			test1.add(item2);
			test2.add(item3);
			test2.add(item4);
			menubar.add(test1);
			menubar.add(test2);
			menubar.add(test3);
			menubar.add(test4);
		
			getContentPane().add(menubar);
		    menubar.setBounds(0, 0, 600, 30);
		    //jcheckbox et jradiobutton
		    
		    JRadioButton h=new JRadioButton("Homme");
		    h.setBounds(20, 180, 90, 20);
		    JRadioButton f=new JRadioButton("Femme");
		    f.setBounds(20, 215, 90, 20);
		     ButtonGroup group=new ButtonGroup(); //pour selectionner une des deux ou plusieurs cases
		     group.add(h);
		     group.add(f);
		     getContentPane().add(h);
		     getContentPane().add(f);
		     JCheckBox B=new JCheckBox("Remember me");
		     B.setBounds(210, 240, 130, 20);
		     B.setSelected(false);//pour ne pas etre coché par défaut
		     getContentPane().add(B);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		     
		     setVisible(true);	
		     
	b1.addActionListener(new Mounir(this));
	
		}
	
}
