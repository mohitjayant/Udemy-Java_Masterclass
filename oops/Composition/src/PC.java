
/**
 * @author Mohit Jayant
 *
 */
public class PC {
	private Case theCase;
	private MotherBoard motherBoard;
	private Monitor monitor;
	
	public PC(Case theCase, MotherBoard motherBoard, Monitor monitor) {
		this.theCase = theCase;
		this.motherBoard = motherBoard;
		this.monitor = monitor;
	}

	public Case getTheCase() {
		return theCase;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public Monitor getMonitor() {
		return monitor;
	}
	
	
	
}
