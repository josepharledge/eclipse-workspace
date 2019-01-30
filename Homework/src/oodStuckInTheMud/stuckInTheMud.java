package oodStuckInTheMud;

public class stuckInTheMud {
	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		DiceBluePrint diceObject = new DiceBluePrint();
		PlayerBluePrint playerObject = new PlayerBluePrint(5);
		GameBluePrint gameObject = new GameBluePrint();
		
		System.out.println("You have "
				+ playerObject.getDiceCount()
					+ " die left.");
		
		while(playerObject.hasDiceLeft) {
			
		}
	}
}
