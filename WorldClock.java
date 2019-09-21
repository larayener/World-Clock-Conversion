
public class WorldClock extends Clock {
	private int timediff;
	
	public WorldClock(int timediff) {
		this.timediff = timediff;
	}
	
	public int getHour() {
		int other = super.getHour() + timediff;
		return other;
	}

}
