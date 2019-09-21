
public class Clock {
	private int[] alarm;
	
	public Clock() {
		alarm = new int[2];
		alarm[0] = -1;
		alarm[1] = -1;
	}
	
	public int getHour() {
		String s = java.time.Instant.now().toString();
		String h = s.substring(11, 13);
		int r = Integer.parseInt(h);
		return r;
	}
	
	public int getMinute() {
		String s = java.time.Instant.now().toString();
		String[] one = s.split("T");
		String[] two = one[1].split(":");
		int r = Integer.parseInt(two[1]);
		return r;
	}
	
	public String getTime() {
		int a = getHour();
		int b = getMinute();
		String c = a + ":" + b;
		if (alarm[0] != -1) {
			if (alarm[0] <= a && alarm[1] <= b) {
				c+= " --> Alarm\u23F0";
				alarm[0] = -1;
				alarm [1] = -1;
			}
		}
		return c;
	}
	
	public void setAlarm(int hours, int minutes) {
		int[] alarm = {hours, minutes};
		this.alarm = alarm;
	}

}
