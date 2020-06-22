package ua.lviv.desctop.part2;

public class Main {

	public static void main(String[] args) {

		Animal a1 = new Animal("Lion", 40, 15);

		System.out.println("Назва тварини-" + a1.getName() + ", вік тварини-" + a1.getAge()
				+ "років, швидкість тварини-" + a1.getSpeed() + "км/год");
		a1.setName("Tiger");
		a1.setAge(30);
		a1.setSpeed(60);

		System.out.println("Назва тварини-" + a1.getName() + ", вік тварини-" + a1.getAge()
				+ "років, швидкість тварини-" + a1.getSpeed() + "км/год");

	}

}
