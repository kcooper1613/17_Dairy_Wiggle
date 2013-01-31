public class TastebudStylist extends Employee(){
	public TastebudStylist(){
		// @BC: This line is redundant; setBWS does not return anything
		baseWeeklySalary = setBaseWeeklySalary(1000);
	}
	public void work(){
		makeShake();
	}
	public void makeShake(){
		if(randomNumberGen(10)==true){
			effectivenessMultiplier = 1;
		}else{
				effectivenessMultiplier = effectivenessMultiplier + .1;
		}
	}
	public String toString(){
		System.out.println("Taste Bud Stylist is happening");
	}
}