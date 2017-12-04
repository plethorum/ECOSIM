class Plant extends Organisms {
	Plant(int health) {
		super(health);
	}

	Plant(int health, int x, int y) {
		super(health, x, y);
	}

	public boolean getGender() {
		return false;
	}
	public void setGender(boolean gender) {
	}
}