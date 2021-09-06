package by.khmara.epam.mod5.task4.bean;

public class Warrior extends Hero {

	public Warrior(String name, int damage) {
		super(name, damage);
	}

	@Override
	public void atack(Dragon dragon) {
		System.out.println(getName() + " strike with the sword " + dragon.getName());
		dragon.takeDamage(getDamage());
		System.out.println(
				dragon.getName() + " took damage " + getDamage() + ". Remaining health is " + dragon.getHealth());

	}

}
