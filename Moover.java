public class Moover extends Employee(){
	public Moover(){
		setBaseWeeklySalary(700);
	}
	public void work(){
		takeOrder();
		deliverShake();
	}
	public void takeOrder(){
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