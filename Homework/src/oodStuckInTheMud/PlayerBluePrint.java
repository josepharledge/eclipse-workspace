package oodStuckInTheMud;

public class PlayerBluePrint {
	
	private int numberOfDice;
	private boolean hasDiceLeft;
	
	public PlayerBluePrint(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}
	
	public int getDiceCount() {
		return this.numberOfDice();
	}
	
	public boolean hasDiceLeft() {
		if (0 < this.numberOfDice) {
			hasDiceLeft = true;
		} else {
			this.hasDiceLeft = false;
		}
		
		return this.hasDiceLeft;
	}
	
}
