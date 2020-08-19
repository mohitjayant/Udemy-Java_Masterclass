
/**
 * @author Mohit Jayant
 *
 */
public class Player {
	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int demage) {
		this.health=this.health-demage;
		if(this.health<=0) {
			System.out.println("Player Knocked Out");
		}
	}
	
	public int healthRemaining() {
		return this.health;
	}
}
