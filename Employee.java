// @BC: Error -- missing a { to start this abstract class
public abstract class Employee
	private int bonusMoney;
	private int effectivenessMultiplier;
	private int baseWeeklySalary;
	private int moneyEarned;
	public Employee() {
		bonusMoney = 100;
		effectivenessMultiplier = 1;
		moneyEarned=0;
	}
	public void earnPaycheck(){
		// @BC: This is the right equation for earning a paycheck, but what is the payCheck variable you have here?
		//		Every week the amount you earn should go straight into the total moneyEarned
		payCheck =  baseWeeklySalary * effectivenessMultiplier;
	}
	// @BC: A few problems here -- would you try reworking this method?
	public void earnBonus(int amount){
		for(int i = 0; i < employees.length; i++){
			private int bonus = salary + amount;
			System.out.println(bonus);
		}
	}
	// @BC: This method says is returns void but is currently returning an int
	public void getEffectivenessMultiplier(){
		return effectivenessMultiplier;
	}
	// @BC: Again, you are close to the right idea here -- but what is the variable 'e'?
	//		Is it a parameter? A temporary variable? Don't you want to be updating the value of 'effectivenessMultiplier'?
	public void setEffectivenessMultiplier(int e){
		int e = effectivenessMultiplier;
		
	}
	// @BC: This method says is returns void but is currently returning an int
	public void getBaseWeeklySalary(){
		return baseWeeklySalary;
	}
	public void setBaseWeeklySalary(int bws){
		baseWeeklySalary = bws;
	}
	
}
