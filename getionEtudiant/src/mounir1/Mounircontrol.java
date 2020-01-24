package mounir1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mounircontrol implements ActionListener {
	
	MounirIHM bb;

	public void actionPerformed(ActionEvent e) {
	MounirVerifMot c = new MounirVerifMot();
	if("correct".equals(c.login(bb.login.getText(), bb.pw.getText()))) {
	Afficher aiohm = new Afficher();
	}
	}

	public Mounircontrol(MounirIHM m) {
	 bb= m;
	}

	
	}
	
	
	
	


