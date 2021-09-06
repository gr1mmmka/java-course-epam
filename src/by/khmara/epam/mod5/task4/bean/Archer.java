package by.khmara.epam.mod5.task4.bean;

public class Archer extends Hero {

	public Archer(String name, int damage) {
		super(name, damage);
	}

	@Override
	public void atack(Dragon dragon) {
		System.out.println(getName() + " shoot the bow " + dragon.getName());
		dragon.takeDamage(getDamage());
		System.out.println(
				dragon.getName() + " took damage " + getDamage() + ". Remaining health is " + dragon.getHealth());

	}

}
