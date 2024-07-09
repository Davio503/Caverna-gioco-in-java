package caverna;

class Domande {
	
	private int vita;		  //MAX 100
	private int indexDomande; //MAX 6
	private int indexQuiz;
	private int giusti;
	
	Domande(){
		vita = 50;
		indexDomande = 0;
		indexQuiz = 0;
		giusti = 0;
	}
	
	protected int getVita() {
		return vita;
	}
	
	protected int getIndexDomande() {
		return indexDomande;
	}
	
	protected int getIndexQuiz() {
		return indexQuiz;
	}
	
	protected int getGiusti() {
		return giusti;
	}
	
	protected void incGiusti() {
		giusti ++ ;
		if(vita<=100) {
			vita+=2;
		}
	}
	
	protected void decVita() {
		vita-=5;
	}
	
	protected void setIndexDomande() {
		indexDomande++;
	}
	
	protected void setIndexQuiz() {
		indexQuiz++;
	}
	
	protected void azzera() {
		giusti = 0;
		indexQuiz = 0;
	}
}
