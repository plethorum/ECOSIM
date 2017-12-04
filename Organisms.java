abstract class Organisms {
	private int x;
	private int y;
	private int health;

	Organisms(int health) {
		this.health = health;
	}
	
	Organisms(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	abstract boolean getGender();

	abstract void setGender(boolean gender);

}
