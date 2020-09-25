
public class Attandance {

	public static void computeEmpWage(String company, int EMP_RATE , int numOfWorkingDays ,int maxHoursPerMonth) {

		int IS_FULL_TIME = 1 ;
		int IS_PART_TIME = 2 ;
		
		
		int empHrs = 0 ;
		int empWages = 0 ;
		
		int totalWages = 0 ;  
		int totalEmpHrs = 0 ;
		int day = 0 ;
		while(day < numOfWorkingDays  && totalEmpHrs <= maxHoursPerMonth){
			day++;
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
			totalEmpHrs += empHrs ; 
			empWages = empHrs * EMP_RATE ;
			totalWages += empWages ;
			System.out.println("Day :" + day +"     Emp Hrs :"+ empHrs);
		}	
		System.out.println("Total Emp wage for company : "+company+" is :"+ totalWages);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			computeEmpWage("mart",20,20,100);
			computeEmpWage("akin",40,10,50);
	}
}
