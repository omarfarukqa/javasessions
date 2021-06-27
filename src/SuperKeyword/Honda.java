package SuperKeyword;

public class Honda extends Car {
	
	int speed = 150;
	
	public void checkSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
	}

}
