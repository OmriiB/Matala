package Filters;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import Objects.WiFiList;

/**
 * This class represents a simple time filter based on a 1D time window range
 * @author Boaz
 *
 */
public class Time_Filter1 implements FileFilter{
public Time_Filter1(String start, String end) {
		_start = start;
		_end = end;
}

public boolean test(WiFiList wifilist) {
String pattern = "dd/MM/yyyy hh:mm";
SimpleDateFormat format = new SimpleDateFormat(pattern);
try {
	Date Start = (Date) format.parse(start);
	Date End = (Date) format.parse(value.substring(value.indexOf(';')+1,value.length() ));
	if (Start.before(wifilist.getTimeStamp())&&End.after(wifilist.getTimeStamp())){
		return true;
	}
}

public String toString() {
	return ""+this.getClass().getName()+" ["+this._start+","+_end+"]";
}
	
/********** Private data can be located anywhere *************/
private String _start, _end;


@Override
public boolean accept(File pathname) {
	// TODO Auto-generated method stub
	return false;
}