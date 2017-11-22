package hw0;

import java.io.File;

import java.io.IOException;

import java.text.ParseException;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub

		int choice = 0;
		String SSID;
		String start, end;
		Scanner sc = new Scanner(System.in);
		double lat, lon, distance;
		Point3D place = null;
		String FileName;

		File folder = new File("C:\\Users\\Omri Baruch\\Desktop\\CSVFile");
		ArrayList<WiFiList> Wifilist = readcsv.readcsvFolder(folder);
		writerCsv.WriterCsv(Wifilist, "InitCsv");

		Filter filter = null;

		System.out.println("please enter what would you like to do: \n  \n  ");
		System.out.println("1.sort by name(SSID)");
		System.out.println("2.sort by Time");
		System.out.println("3.Sort By Distance");
		System.out.println("4.Exit");

		choice = sc.nextInt();
		while (choice != 4) {
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter SSID name (Afikim/Bezeq/Ariel) ");
				SSID = sc.next();
				filter = new Filter("SSID", SSID);
				FileName = "SSIDCSV";
				writerCsv.WriteByFilter(Wifilist, filter, FileName);
				File file1 = new File(folder + "\\OneCsv\\" + FileName + ".csv");
				CreateKml.csvtokml(file1);
			}
				break;
			case 2: {
				System.out.println("Enter start time (dd/MM/yyyy hh:mm) ");
				start = sc.nextLine();

				System.out.println("Enter end time (dd/MM/yyyy hh:mm) ");
				end = sc.nextLine();
				filter = new Filter("Date", start + ";" + end);
				FileName = "TimeCSV";
				writerCsv.WriteByFilter(Wifilist, filter, FileName);
				File file1 = new File(folder + "\\OneCsv\\" + FileName + ".csv");
				CreateKml.csvtokml(file1);
			}
				break;
			case 3: {
				System.out.println("Enter your lat coordinate");
				lat = sc.nextDouble();

				System.out.println("Enter end lon coordinate ");
				lon = sc.nextDouble();

				System.out.println("Enter distance from your place in km ");
				distance = sc.nextDouble();

				place = new Point3D(lat, lon, 0);
				filter = new Filter("Distance", place, distance);
				FileName = "DistanceCSV";
				writerCsv.WriteByFilter(Wifilist, filter, FileName);
				File file1 = new File(folder + "\\OneCsv\\" + FileName + ".csv");
				CreateKml.csvtokml(file1);
				break;
			}
			case 4: {

			}

			}
			if (choice != 4) {
				System.out.println("press 1-3 to another filter/4 to exit");
				choice = sc.nextInt();
			}
		}
		sc.close();
		writerCsv.make10List(Wifilist);
		String finalCsv = "C:\\Users\\Omri Baruch\\Desktop\\CSVFile\\FinalCsv\\FinalCSV.csv";
		File file1 = new File(finalCsv);
		CreateKml.csvtokml(file1);

	}
}
