
public class Attandance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Branch");	
		
		int IS_FULL_TIME = 1 ;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Is Present");
		}
		else {
			System.out.println("Not present");
		}
		
	}
}
