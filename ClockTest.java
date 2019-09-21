
public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		WorldClock w = new WorldClock(8);
		c.setAlarm(20, 21);
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		w.setAlarm(20, 21);
		System.out.println(w.getTime());
		System.out.println(w.getTime());
		
	}

}
