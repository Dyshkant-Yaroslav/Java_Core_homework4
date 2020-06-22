package ua.lviv.desctop.part1;

public class Robot {
	private String name = "Robot";

	Robot() {

	}

	@Override
	public String toString() {
		return "Robot [name=" + name + "]";
	}

	public void work() {
		System.out.println("Я " + name + " - я просто працюю");
	}

}
