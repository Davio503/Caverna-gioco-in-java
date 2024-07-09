package caverna;

class Scienze {

	private static final String DOMANDE[] = 
		   {
			"FORMULA DEL SALE DA CUCINA?",
			"FORMULA DELL'ACQUA?",
			"CLORULO DI SODIO, CONOSCIUTO ANCHE COME: ?",
			"L'UNICO MUSCOLO INVOLONTARIO STRIATO ?",
			"ACIDO DESISSURUBONUCLEIC, CONOSCIUTO COME ?",
			"QUANTI CROMOSOMI HA L'UOMO ?",
			"LA PRIMA \"AUSTRALOPITHECUS AFARENSIS\": ?",
			"QUANTE LUNE HA LA TERRA?",
			"LITRI DEL SANGUE NELL'UOMO: ?",
			"QUALE DITO DI GALILEO GALILEI è CONTENUTO IN UN MUSEO?"};
	private static final String RISPOSTE[] = 
		   {"NaCl","Cl","Salt","Nada",
			"H3O","H2O2","H2O","HO",
			"SALE","ACIDO","CLORO","SODIO",
			"POLMONE","CERVELLO","...","CUORE",
			"RNA","MNA","SNA","DNA",
			"56","46","52","62",
			"LUCY","LEY","LARA","LUCIA",
			"1","3","5","7",
			"CIRCA 6 LITRI","CIRCA 10 LITRI","CIRCA 19 LITRI","CIRCA 13 LITRI",
			"IL MIGNOLO","IL POLLICE","L'INDICE","IL MEDIO"};
	private static final String RISPOSTA[] = 
		   {
			"NaCl",
			"H2O",
			"SALE",
			"CUORE",
			"DNA",
			"46",
			"LUCY",
			"1",
			"CIRCA 6 LITRI",
			"IL MEDIO"};
	
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
