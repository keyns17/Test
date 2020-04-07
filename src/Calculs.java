public class Calculs
{
        private final int operande1;
        private final int operande2;

        public Calculs(int operande1, int operande2)
        {
                this.operande1 = operande1;
                this.operande2 = operande2;
        }
        
        // public Calculs = null;
        
        public int multiplier() // public int testMultiplier() { if(c.multiplier() == 2 } { /*OK*/ } else { /*KO*/ }
        {
                return operande1 * operande2;
        }
        
        public int additionner()
        {
                return operande1 + operande2;
        }
        
        public int diviser()
        {
                return operande1 / operande2;
        }
        
        public int soustraire()
        {
                return operande1 - operande2;
        }
        
        public static void main(String[] args) {
    		
        	int a = 2; 
        	int b = 4;
        	//static Scanner clavier = new Scanner(System.in);
    		Calculs c = new Calculs(a,b);
    		Calculs c1 = new Calculs(a,b);
    		System.out.println("Démarage des test : ");
    		//System.out.println(c.multiplier());
    		try {
    		System.out.println("\n2 / 4 = " + c.diviser());
    		}
    		catch(MyArithmeticExeption m) {
    			System.err.println("\n" + m.getExceptionDescription());
    		}
    		catch(Exception m2) {
    			System.err.println("");
    		}
    		System.out.println("2 + 4 = " + c.additionner());
    		System.out.println("2 - 4 = " + c.soustraire());
    		System.out.println("2 * 4 = " + c.multiplier());

    	}
}