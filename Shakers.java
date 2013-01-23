public class Shakers extends Employee{
	public Shakers(){
		setBaseWeeeklySalary(600);
	}
	public void work(){
		shake();
	}
	public void shake(){
		effectivnessMultiplier = effectivnessMultiplier + .02;
	}
	public String toString(){
		System.out.println("Shaker is happening");
	}
}