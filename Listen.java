package caverna;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Listen implements ActionListener{
	
	ApriScheda ap;
	
	Listen(ApriScheda ap){
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
			if(source.getText().equals("BOSS")) {
				if(ap.domande.getIndexDomande()!=6) {
					JOptionPane.showMessageDialog(null, "SBLOCCA TUTTI GLI ALTRI PRIMA");
				}
				else {
					ap.rimuovi();
					ap.question();
					ap.categorie[6].setBackground(Color.BLACK);
				}
			}
			if(source.getText().equals("ITALIANO")) {
				
				if(ap.domande.getIndexDomande() > 0) {
					JOptionPane.showMessageDialog(null, "NON PUOI RIFARLO\nVAI AVANTI");
				}
				else {
					
					ap.rimuovi();
					ap.question();
					ap.categorie[0].setBackground(Color.BLACK);
					
				}
			}
			
			if(source.getText().equals("STORIA")) {
				if(ap.domande.getIndexDomande()<1) {
					JOptionPane.showMessageDialog(null, "SBLOCCA I PRECEDENTI");
				}
				else if(ap.domande.getIndexDomande() > 1) {
					JOptionPane.showMessageDialog(null, "NON PUOI RIFARLO\nVAI AVANTI");
				}
				else {
					ap.rimuovi();
					ap.question();
					ap.categorie[1].setBackground(Color.BLACK);
				}
			}
			
			if(source.getText().equals("MATEMATICA")) {
				if(ap.domande.getIndexDomande()<2) {
					JOptionPane.showMessageDialog(null, "SBLOCCA I PRECEDENTI");
				}
				else if(ap.domande.getIndexDomande() > 2) {
					JOptionPane.showMessageDialog(null, "NON PUOI RIFARLO\nVAI AVANTI");
				}
				else {
					ap.rimuovi();
					ap.question();
					ap.categorie[2].setBackground(Color.BLACK);
				}
			}
			
			if(source.getText().equals("SCIENZE")) {
				if(ap.domande.getIndexDomande()<3) {
					JOptionPane.showMessageDialog(null, "SBLOCCA I PRECEDENTI");
				}
				else if(ap.domande.getIndexDomande() > 3) {
					JOptionPane.showMessageDialog(null, "NON PUOI RIFARLO\nVAI AVANTI");
				}
				else {
					ap.rimuovi();
					ap.question();
					ap.categorie[3].setBackground(Color.BLACK);
				}
			}
			
			if(source.getText().equals("POLITICA")) {
				if(ap.domande.getIndexDomande()<4) {
					JOptionPane.showMessageDialog(null, "SBLOCCA I PRECEDENTI");
				}
				else if(ap.domande.getIndexDomande() > 4) {
					JOptionPane.showMessageDialog(null, "NON PUOI RIFARLO\nVAI AVANTI");
				}
				else {
					ap.rimuovi();
					ap.question();
					ap.categorie[4].setBackground(Color.BLACK);
				}
			}
			
			if(source.getText().equals("EDUCAZIONE CIVICA")) {
				if(ap.domande.getIndexDomande()<5) {
					JOptionPane.showMessageDialog(null, "SBLOCCA I PRECEDENTI");
				}
				else if(ap.domande.getIndexDomande() > 5) {
					JOptionPane.showMessageDialog(null, "NON PUOI RIFARLO\nVAI AVANTI");
				}
				else {
					ap.rimuovi();
					ap.question();
					ap.categorie[5].setBackground(Color.BLACK);
				}
			}
		}
		
	}

}
