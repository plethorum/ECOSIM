abstract class Animals extends Organisms{
	boolean gender;

	Animals(int health, boolean gender) {
		super(health);
		this.gender = gender;
	}

	Animals(int health, int x, int y, boolean gender) {
		super(health, x, y);
		this.gender = gender;
	}

	boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
