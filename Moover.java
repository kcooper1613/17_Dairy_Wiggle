public class Moover extends Employee(){
	// @BC: This class looks great. The only problem is the way you are trying to access
	//		the private 'effectivenessMultiplier' which is private. Use public accessor/ mutators instead
	public Moover(){
		setBaseWeeklySalary(700);
	}
	public void work(){
		takeOrder();
		deliverShake();
	}
	public void takeOrder(){
		// @BC: The randomNumberGen method is not accessible from this class; it also does not take a parameter right now
		if(randomNumberGen(20)==true){
			effectivenessMultiplier = effectivenessMultiplier - .1;
		}else{
			effectivenessMultiplier = effectivenessMultiplier + .05;
		}
	}
	public void deliverShake(){
		if(randomNumberGen(5)==true){
			effectivenessMultiplier = effectivenessMultiplier - .1;
		}else{
			effectivenessMultiplier = effectivenessMultiplier + .03;
		}
	}
	public String toString(){
		System.out.println("Moover is happening");
	}
}