package by.khmara.epam.mod5.task4.bean;

public class Dragon {
	private String name;
	private int health;

	public Dragon() {
		name = "Dragon";
		health = 120;
	}

	public boolean isALive() {
		return health > 0 ? true : false;
	}

	public int takeDamage(int damage) {
		return health -= Math.min(damage, health);
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

}
