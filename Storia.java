package caverna;

class Storia {

	private static final String DOMANDE[] = 
		   {
			"CHI è STATO IL PRIMO RE DI ROMA?",
			"CHI ERA NAPOLEONE?",
			"CHI ERA BOB MARLEY?",
			"E COSA FACEVA?",
			"L'ANNO DELLA TRAGEDIA AMERICANA?",
			"IN CHE ANNO EBBE INIZIO LA TERZA GUERRA MONDIALE?",
			"COSA HA INVENTATO GALILEO GALILEI?",
			"IN CHE HANNO è STATO INVENTATO IL PRIMO COMPUTER?",
			"IN CHE ANNO è MORTO HITLER?",
			"IN  CHE ANNO è USCITA L'ELYTRA SU MINECRAFT?"};
	private static final String RISPOSTE[] = 
		   {"REMO","ROMOLO","REMOLO","ROMO",
			"UN TEDESCO","UN JAMAICANO","UN IMPERATORE","UN TIRANNO",
			"UN TEDESCO","UN JAMAICANO","UN IMPERATORE","UN TIRANNO",
			"LO SPACCIATORE","IL CANTANTE","L' IMPIEGATO","IL CASSIERE",
			"2000","2001","2002","2003",
			"PROSSIMAMENTE","1940","1939","ANCORA NO",
			"LA MAPPA STELLARE","IL TELECOMANDO","IL BINOCOLO","IL TELESCOPIO",
			"1946","1859","1969","2002",
			"1945","1946","1956","1955",
			"2016","2013","2019","2015"};
	private static final String RISPOSTA[] = 
		   {
			"ROMOLO",
			"UN IMPERATORE",
			"UN JAMAICANO",
			"IL CANTANTE",
			"2001",
			"ANCORA NO",
			"IL TELESCOPIO",
			"1946",
			"1945",
			"2015"};
	
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
