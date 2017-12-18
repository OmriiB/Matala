package hw0;

import java.util.ArrayList;
import java.util.Date;

public class MacWiFiList implements Comparable<MacWiFiList> {
	private static int id = 0;
	private int uid;
	private Date timeStamp;
	String SSID, MAC;
	int channel;
	private ArrayList<MacWiFi> array;
	
	public MacWiFiList(Date timeStamp,String SSID,String MAC,int channel,int signal){
		this.timeStamp=timeStamp;
		this.SSID=SSID;
		this.MAC=MAC;
		this.channel=channel;
		
		
	}
	public void add(MacWiFi MacWiFi) {
		array.add(MacWiFi);
	}	
	

	public String getSSID() {
		return SSID;
	}

	public void setSSID(String sSID) {
		SSID = sSID;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public ArrayList<MacWiFi> getArray() {
		return array;
	}

	public void setArray(ArrayList<MacWiFi> array) {
		this.array = array;
	}

	@Override
	public int compareTo(MacWiFiList o) {
		return this.MAC.compareTo(MAC);

	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMac() {
		return MAC;
	}

	public void setMac(String mac) {
		MAC = mac;
	}
}
