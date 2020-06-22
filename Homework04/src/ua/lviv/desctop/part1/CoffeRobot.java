package ua.lviv.desctop.part1;

public class CoffeRobot extends Robot {
	private String name = "CoffeRobot";

	@Override
	public void work() {
		System.out.println("Я " + name + "- я варю каву");
	}

}
