package caverna;

class EducazioneCivica {

	private static final String DOMANDE[] = 
		   {
			"IN CHE ANNO è ENTRATA IN VIGORE LA COSTITUZIONE ITALIANA?",
			"CHE VUOL DIRE CEE?",
			"QUANTI VETI PUO' CONCEDERE IL CAPO DELLO STATO?",
			"QUANTE CAMERE ESISTONO NELLO STATO ITALIANO?",
			"QUANTE FORZE MILITARI ESISTONO IN ITALIA?",
			"QUALE TRA QUESTI NON è MILITARE?",
			"QUALE TRA QUESTI PAESI NON è NELLA NATO?",
			"COSA VUOL DIRE NATO?",
			"L'ITALIA ERA NELL'ALLEANZA DELL'ASSE A : ?",
			"E A: ?"};
	private static final String RISPOSTE[] = 
		   {"1948","1950","1952","1861",
			"COMUNITA' ECONOMICA EUROPEA","COMUNITA' EUROPEA ELETTRICITA'","CENTRO ELETTRICO ENEL","CENTRO ESTETICO ERMES",
			"1","2","3","4",
			"1","2","3","4",
			"1","2","3","4",
			"CARABINIERI","ESERCITO","POLIZIA","AERONAUTICA",
			"PAESI BASSI","POLONIA","UCRAINA","RUSSIA",
			"NORTH ATLANTIC TREATY ORGANIZATION","NORTH ATLANTIC TREACK ORGANIZATION","NORTH ATLANTIC TREATY ORIGINAL","NINE ATLANTIC TREATY ORGANIZATION",
			"GERMANIA","FRANCIA","CINA","INGHILTERRA",
			"GIAPPONE","JAMAICA","RUSSIA","SPAGNA"};
	private static final String RISPOSTA[] = 
		   {
			"1948",
			"COMUNITA' ECONOMICA EUROPEA",
			"1",
			"2",
			"4",
			"POLIZIA",
			"RUSSIA",
			"NORTH ATLANTIC TREATY ORGANIZATION",
			"GERMANIA",
			"GIAPPONE"};
	
	protected static String getDomande(int i) {
		return DOMANDE[i];
	}
	
	protected static String getRisposte(int i) {
		return RISPOSTE[i];
	}
	
	protected static String getrisposta(int i) {
		return RISPOSTA[i];
	}
}