

public class MyArithmeticExeption extends ArithmeticException {
	
	public MyArithmeticExeption() {
		
	}

	public MyArithmeticExeption(String arg0) {
		super(arg0);
	}
	
	public String getExceptionDescription() {
		String affichage = "";
		affichage += "Anomalie de calcul : " + this.getMessage();
		affichage += this.getCause().getMessage();
		affichage += "" + this.getLocalizedMessage();
		
		return affichage;
		
	}
}
