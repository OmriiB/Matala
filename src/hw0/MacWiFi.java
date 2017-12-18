package hw0;

public class MacWiFi implements Comparable<MacWiFi> {
	private Point3D point;
	private int signal;
	
	public MacWiFi(Point3D point, int signal){
		this.point=point;
		this.signal=signal;
	}

	public Point3D getPoint() {
		return point;
	}

	public void setPoint(Point3D point) {
		this.point = point;
	}

	public int getSignal() {
		return signal;
	}

	public void setSignal(int signal) {
		this.signal = signal;
	}

	@Override
	public int compareTo(MacWiFi o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
