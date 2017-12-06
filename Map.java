import java.util.Random;

class Map {
	private Organisms[][] grid;
	int length;
	int width;

	Map() {
		grid = new Organisms[25][25];
	}

	Map(int length, int width) {
		this.length = length;
		this.width = width;
		grid = new Organisms[length][width];
	}

	public void addSheep(int numberOfSheep, int health){
		for (int i = 0; i < numberOfSheep; i++) {
			grid[randY(length)][randX(width)] = new Sheep(health, randGender());
		}
	}
	public void addWolf(int numberOfWolves, int health){
		for (int i = 0; i < numberOfWolves; i++) {
			grid[randY(length)][randX(width)] = new Wolf(health, randGender());
		}
	}	
	public void addPlant(int spawnrate, int nutrients){
		for (int i = 0; i < spawnrate; i++) {
			grid[randY(length)][randX(width)] = new Plant(nutrients);
		}
	}

	public int randX(int width) {
		return (int)(Math.random() * width);
	}
	public int randY(int length) {
		return (int)(Math.random() * length);
	}
	public boolean randGender() {
		Random rand = new Random();
		return rand.nextBoolean();
	}

	
} 