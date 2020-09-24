
public class Attandance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int IS_FULL_TIME = 1 ;
		int IS_PART_TIME = 2 ;
		
		int EMP_RATE = 20 ;
		int empHrs = 0 ;
		int empWages = 0 ;
		
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		
		switch(empCheck){
			case 2:
				empHrs = 4 ;
				break;
			case 1:
				empHrs = 8 ;
				break;
			default:
				empHrs = 0;
		}
		empWages = empHrs * EMP_RATE ;
		System.out.println("Emp Wages :" + empWages);
	}
}
