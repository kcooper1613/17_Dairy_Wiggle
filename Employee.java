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
		payCheck =  baseWeeklySalary * effectivenessMultiplier;
	}
	public void earnBonus(int amount){
		for(int i = 0; i < employees.length; i++){
			private int bonus = salary + amount;
			System.out.println(bonus);
		}
	}
	public void getEffectivenessMultiplier(){
		return effectivenessMultiplier;
	}
	public void setEffectivenessMultiplier(int e){
		int e = effectivenessMultiplier;
		
	}
	public void getBaseWeeklySalary(){
		return baseWeeklySalary;
	}
	public void setBaseWeeklySalary(int bws){
		baseWeeklySalary = bws;
	}
	
}
