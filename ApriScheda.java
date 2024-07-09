package caverna;

import javax.swing.*;
import java.awt.*;



class 	ApriScheda extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected  Domande domande;
	
	protected  JButton categorie[] = new JButton[7];
	protected  JButton quest[] = new JButton[4];
	protected  JLabel label[] = new JLabel[4];;
	
	protected  JPanel est = new JPanel(new GridLayout(4, 1));
	protected  JPanel ovest = new JPanel(new GridLayout(4, 1));
	protected  JPanel sud = new JPanel(new GridLayout(1, 3));
	protected  JPanel centro = new JPanel(new GridLayout(3, 2));
	protected  JPanel nord = new JPanel(new GridLayout(8, 1));
	
	
	ApriScheda() {
		super("LA CAVERNA DEI QUIZ");
		
		inizio();
		rimuovi();
		home();
			
		for(int i=0;i<categorie.length; i++) {
			categorie[i].addActionListener(new Listen(this));
		}
		
		for(int i=0;i<quest.length; i++) {
			quest[i].addActionListener(new Listen2(this));
		}
		
		getContentPane().add(ovest, BorderLayout.WEST);
		getContentPane().add(est, BorderLayout.EAST);
		getContentPane().add(sud, BorderLayout.SOUTH);	
		getContentPane().add(centro, BorderLayout.CENTER);
		getContentPane().add(nord, BorderLayout.NORTH);	
		
		setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
        setVisible(true);
	}
	
	
	
	private  final void inizio() {
		domande = new Domande();
		
		categorie[0] = new JButton("ITALIANO");
		categorie[0].setPreferredSize(new Dimension(250, 250));
		categorie[1] = new JButton("STORIA");
		categorie[1].setPreferredSize(new Dimension(250, 250));
		categorie[2] = new JButton("MATEMATICA");
		categorie[3] = new JButton("SCIENZE");
		categorie[4] = new JButton("POLITICA");
		categorie[5] = new JButton("EDUCAZIONE CIVICA");
		categorie[6] = new JButton("BOSS");
		categorie[6].setPreferredSize(new Dimension(100, 250));
		categorie[6].setIcon(new ImageIcon("/Caverna/src/Caverna/Exit.png"));
		
		quest[0] = new JButton();
		quest[1] = new JButton();
		quest[2] = new JButton();
		quest[3] = new JButton();
		
		label[0] = new JLabel(String.valueOf(domande.getIndexDomande()) + "/6");
		label[1] = new JLabel(String.valueOf(domande.getVita()) + "/100");
		label[2] = new JLabel("");
		label[3] = new JLabel("");
		
		ovest.add(label[0]);
		ovest.add(categorie[0]);
		ovest.add(categorie[2]);
		ovest.add(categorie[4]);
		
		est.add(label[1]);
		est.add(categorie[1]);
		est.add(categorie[3]);
		est.add(categorie[5]);
		
		sud.add(new JPanel());
		sud.add(categorie[6]);
		sud.add(new JPanel());
		
		centro.add(quest[0]);
		centro.add(quest[1]);
		centro.add(quest[2]);
		centro.add(quest[3]);
		
		nord.add(label[0]);
		nord.add(new JPanel());
		nord.add(label[1]);
		nord.add(new JPanel());
		nord.add(label[2]);
		
	}
	
	protected  void home() {
		
		Font font = label[2].getFont();
        label[2].setFont(new Font(font.getName(), Font.PLAIN, 24));
        label[0].setFont(new Font(font.getName(), Font.PLAIN, 18));
        label[1].setFont(new Font(font.getName(), Font.PLAIN, 18));
        
		label[0].setText(String.valueOf(domande.getIndexDomande()) + "/6 COMPLETATI ");
		label[1].setText(String.valueOf(domande.getVita()) + "/100 VITA RIMANENTE ");
		label[2].setText(String.valueOf(domande.getIndexDomande()) + "/6 COMPLETATI ");
		
		ovest.add(label[0]);
		ovest.add(categorie[0]);
		ovest.add(categorie[2]);
		ovest.add(categorie[4]);
		
		est.add(label[1]);
		est.add(categorie[1]);
		est.add(categorie[3]);
		est.add(categorie[5]);
		
		sud.add(new JPanel());
		sud.add(categorie[6]);
		sud.add(new JPanel());
	}
	
	protected  void question() {
		label[0].setText(String.valueOf(domande.getIndexDomande()) + "/6 COMPLETATI ");
		label[1].setText(String.valueOf(domande.getVita()) + "/100 VITA RIMANENTE ");
		label[2].setText(String.valueOf(domande.getIndexDomande()) + "/6 COMPLETATI ");
		
		if(domande.getIndexDomande() == 6) {
			label[3].setText(String.valueOf(domande.getGiusti()) + "/29 COMPLETATI ");
		}
		else {
			label[3].setText(String.valueOf(domande.getGiusti()) + "/10 GIUSTI ");
		}
		
		int i = domande.getIndexQuiz();
		int j = 4*i;
			switch (domande.getIndexDomande()) {
				case 0: {
					label[2].setText(Italiano.getDomande(i));	
					
						quest[0].setText(Italiano.getRisposte(j+0));
						quest[1].setText(Italiano.getRisposte(j+1));
						quest[2].setText(Italiano.getRisposte(j+2));
						quest[3].setText(Italiano.getRisposte(j+3));
					break;
				}
				case 1: {
					label[2].setText(Storia.getDomande(i));	
					
						quest[0].setText(Storia.getRisposte(j+0));
						quest[1].setText(Storia.getRisposte(j+1));
						quest[2].setText(Storia.getRisposte(j+2));
						quest[3].setText(Storia.getRisposte(j+3));

					break;
				}
				case 2: {
					label[2].setText(Matematica.getDomande(i));	
				
						quest[0].setText(Matematica.getRisposte(j+0));
						quest[1].setText(Matematica.getRisposte(j+1));
						quest[2].setText(Matematica.getRisposte(j+2));
						quest[3].setText(Matematica.getRisposte(j+3));
						
					break;
				}
				case 3: {
					label[2].setText(Scienze.getDomande(i));	
					
						quest[0].setText(Scienze.getRisposte(j+0));
						quest[1].setText(Scienze.getRisposte(j+1));
						quest[2].setText(Scienze.getRisposte(j+2));
						quest[3].setText(Scienze.getRisposte(j+3));
					
					break;
				}
				case 4: {
					label[2].setText(Politica.getDomande(i));	
					
						quest[0].setText(Politica.getRisposte(j+0));
						quest[1].setText(Politica.getRisposte(j+1));
						quest[2].setText(Politica.getRisposte(j+2));
						quest[3].setText(Politica.getRisposte(j+3));
					
					break;
				}
				case 5: {
					label[2].setText(EducazioneCivica.getDomande(i));	
					
						quest[0].setText(EducazioneCivica.getRisposte(j+0));
						quest[1].setText(EducazioneCivica.getRisposte(j+1));
						quest[2].setText(EducazioneCivica.getRisposte(j+2));
						quest[3].setText(EducazioneCivica.getRisposte(j+3));
					
					break;
				}
				
				case 6: {
					label[2].setText(Boss.getDomande(i));	
					
						quest[0].setText(Boss.getRisposte(j+0));
						quest[1].setText(Boss.getRisposte(j+1));
						quest[2].setText(Boss.getRisposte(j+2));
						quest[3].setText(Boss.getRisposte(j+3));
					
					break;
				}
			}

		
		if(domande.getIndexQuiz() == 5) {
			
		}
		
		Font font = label[2].getFont();
        label[2].setFont(new Font(font.getName(), Font.PLAIN, 24));
        label[0].setFont(new Font(font.getName(), Font.PLAIN, 18));
        label[1].setFont(new Font(font.getName(), Font.PLAIN, 18));
        label[3].setFont(new Font(font.getName(), Font.PLAIN, 18));
        
		
		centro.add(quest[0]);
		centro.add(quest[1]);
		centro.add(quest[2]);
		centro.add(quest[3]);

		nord.add(label[0]);
		nord.add(label[1]);
		nord.add(label[3]);
		nord.add(new JPanel());
		nord.add(new JPanel());
		nord.add(new JPanel());
		nord.add(new JPanel());
		nord.add(label[2]);
		
	}
	
	protected  void ending(boolean alpha) {
		 if(alpha) {
			 JOptionPane.showMessageDialog(null, "Hai perso!");
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "Hai vinto!");
		 }
		 System.exit(0);
	}
	
	
	protected  void rimuovi()
	{
		est.removeAll();
		est.revalidate();
		est.repaint();
		sud.removeAll();
		sud.revalidate();
		sud.repaint();
		ovest.removeAll();
		ovest.revalidate();
		ovest.repaint();
		centro.removeAll();
		centro.revalidate();
		centro.repaint();
		nord.removeAll();
		nord.revalidate();
		nord.repaint();

	}
	
	
}
