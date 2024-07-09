package caverna;

class Matematica {

	private static final String DOMANDE[] = 
		   {
			"1+1=?",
			"10^2=?",
			"x^2 = 4 == ?",
			"x = 3; y = 5; Z=?; w = 9",
			"RADICE QUADRATA DI 25 = ?",
			"5^3 = ?",
			"7+7+7+7+7+7+7 = ?",
			"7^2 = ?",
			"Alpha = -3; Beta =-5; Gamma = Alpha + Beta; Gamma = ?",
			"+ * - = ?"};
	
	private static final String RISPOSTE[] = 
		   {"1","2","3","4",
			"10","100","1000","1956",
			"2","4","16","12",
			"4","6","7","8",
			"25","2","5","52",
			"125","255","300","215",
			"7*7","7^7","7=7","7^-2",
			"48","94","49","84",
			"-8","+8","8i","i8",
			"+","-","*","/"};
	private static final String RISPOSTA[] = 
		   {
			"2",
			"100",
			"2",
			"7",
			"5",
			"125",
			"7*7",
			"49",
			"-8",
			"-"};
	
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
