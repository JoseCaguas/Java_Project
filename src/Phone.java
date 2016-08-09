

	public class Phone
	{
	 final int PRICE_MIN = 999;
	 final int PRICE_MAX = 5600;	//final variable
	 
	 final void display()	//final method
	 {
	  System.out.println("Min Price is" + PRICE_MIN);
	  System.out.println("Max Price is" + PRICE_MAX );
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone jose = new Phone();
		jose.display();
			
		}
	}

