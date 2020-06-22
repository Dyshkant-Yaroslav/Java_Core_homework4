package ua.lviv.desctop.part1;

public class RobotCoocker extends Robot {
	private String name = "RobotCoocker";

	@Override
	public void work() {
		System.out.println("Я " + name + "- я просто готую");
	}

}
