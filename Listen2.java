package caverna;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listen2 implements ActionListener{
	
	ApriScheda ap;
	
	Listen2(ApriScheda ap){
		this.ap = ap; 
	}
	
	void controllo() {
		if(ap.domande.getIndexQuiz() == 29 && ap.domande.getGiusti() < 20) {
			ap.ending(true);
		}
		
		if(ap.domande.getIndexQuiz() == 29 && ap.domande.getGiusti() > 20) {
			ap.ending(false);
		}

		if(ap.domande.getVita() <= 0) {
			ap.ending(true);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		controllo();
		
		if(e.getSource() instanceof JButton) {
			JButton source = (JButton) e.getSource();
			String test="";
			int alpha = 10;
			switch (ap.domande.getIndexDomande()){
				case 0: {
					test = Italiano.getrisposta(ap.domande.getIndexQuiz());
					break;
				}
				case 1: {
					test = Storia.getrisposta(ap.domande.getIndexQuiz());
					break;
				}
				case 2: {
					test = Matematica.getrisposta(ap.domande.getIndexQuiz());
					break;
				}
				case 3: {
					test = Scienze.getrisposta(ap.domande.getIndexQuiz());
					break;
				}
				case 4: {
					test = Politica.getrisposta(ap.domande.getIndexQuiz());
					break;
				}
				case 5: {
					test = EducazioneCivica.getrisposta(ap.domande.getIndexQuiz());
					break;
				}
				case 6: {
					test = Boss.getrisposta(ap.domande.getIndexQuiz());
					alpha = 29;
					break;
				}
			}
			
			
			
			
			
			if(source.getText().equals(test) ) {
				ap.domande.incGiusti();
				ap.domande.setIndexQuiz();
				ap.rimuovi();
				controllo();
			}
			else {
				 JOptionPane.showMessageDialog(null, "ERRATO! era: "+test);
				ap.domande.decVita();
				ap.domande.setIndexQuiz();
				ap.rimuovi();	
				controllo();
				
			}
			if(ap.domande.getIndexQuiz() == alpha) {
				controllo();
				if(ap.domande.getGiusti() > 5) {
					ap.categorie[ap.domande.getIndexDomande()].setBackground(Color.GREEN);
				}
				else {
					ap.categorie[ap.domande.getIndexDomande()].setBackground(new Color(178, 0, 39));
				}
				ap.domande.setIndexDomande();
				ap.domande.azzera();
				ap.home();
			}
			else {
				ap.question();
			}
			
		}
	}
}
