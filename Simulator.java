import java.util.Random;
// @BC: This class has a number of syntax errors preventing it from compiling
//		Also, it never tells Employees to work() and it never outputs any messages regarding progress
public class Simulator{
	private int day;
	private Week Week[5];
	private Employee[] employees;
	public static void main(String[] args){
		System.out.println("The Dairy Wiggle simulation has begun.");
		Simulator s = new Simulator();
		
	}
	public Simulator(){
		employees = new Employee[12];
		// @BC: What is 'i' at this point?
		Employee x = new Employee[i];
		System.out.println(x);
		for(int i = 0; i < 4; i++){
			Shaker s = new Shaker();
			employees[i]=s;
		}
		for(int i=0; i< 8; i++){
			Moover m = new Moover();
			employees[i]=m;
		}
		// @BC: Since this for loop happens last, it will begin at 0 and overwrite every item in the array
		for(int i=0; i<12; i++){
			TasteBudStylist tbs = new TasteBudStylist();
			employees[i]=tbs;
		}
		for(int i=0; i<12; i++){
			for(int j=0; j<employees.length; j++){
				employees[i].work();
			}
		}
	public boolean randomNumberGen(){
		Random r = new Random();
		int myNum = r.nextInt(100);
		if(l<myNum){
			return true;
		}else{
			return false;
		}
	}
/*		for(int i = 0; i<5; i++){
			x.work();
			System.out.println(x);
			if(i == 5){
				x.earnPaycheck();
			}
		}
	}
		
	public String setWeeklyReport(){
		private String a = "";
		for(int i = 0;  i <employees.length){
			private String weeklyReport = gwr;
		}
	}
	public String getWeeklyReport(){
		return weeklyReport
	}

	public int getYearlyPay(){
		return yearlyPay
	}
	*/
	
}