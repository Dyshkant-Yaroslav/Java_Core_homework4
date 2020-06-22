package ua.lviv.desctop.part1;

public class Main {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		CoffeRobot r2 = new CoffeRobot();
		RobotCoocker r3 = new RobotCoocker();
		RobotDancer r4 = new RobotDancer();
		r1.work();
		r2.work();
		r3.work();
		r4.work();
		System.out.println(" ");
		Robot[] array = { r1, r2, r3, r4 };
		for (int i = 0; i < array.length; i++) {
			array[i].work();
		}

	}

}
