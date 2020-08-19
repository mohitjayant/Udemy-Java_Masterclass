
public class Main {
	
	public static void main(String[] args) {
		/*
		 * Player player=new Player(); player.name="Mohit"; player.health=50;
		 * player.weapon="Sword";
		 * 
		 * player.loseHealth(40);
		 * System.out.println("Health= "+player.healthRemaining());
		 * 
		 * player.loseHealth(11);
		 * System.out.println("Health= "+player.healthRemaining());
		 */
		
		EnhancedPlayer enhancedPlayer=new EnhancedPlayer("Mohit", 50, "Sword");
		System.out.println("Initial Health= "+enhancedPlayer.getHealth());
		
		
		
	}
}
