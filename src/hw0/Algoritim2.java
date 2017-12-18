package hw0;

import java.util.ArrayList;

public class Algoritim2 {

	public static ArrayList<WiFiList> Algoritim5 (ArrayList<WiFiList> CsvFile)
	{

	Router[] routers= new Router[10];
	int counter=1;
	int signal;
	String mac;
	Point3D point;
	Router router;

	for (int i = 0; i < CsvFile.size(); i++) {

		point=(CsvFile.get(i).getPoint());
		mac=CsvFile.get(i).getArray().get(0).getMAC();
		signal=CsvFile.get(i).getArray().get(0).getSignal();
		router=new Router (point,signal);
		routers[counter-1]=router;


		for(int k=i+1;k<CsvFile.size();k++)
		{

			if(CsvFile.get(k).getArray().get(0).getMAC().equals(mac))
			{
				if(counter<10)
				{
					counter++;
					point=(CsvFile.get(k).getPoint());
					signal=CsvFile.get(k).getArray().get(0).getSignal();
					router=new Router (point,signal);
					routers[counter-1]=router;
					CsvFile.remove(k);
				}
			}

		}

	
}
	return CsvFile;}}