package hw0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.TimePrimitive;

public class CreateKml {

	public static void csvtokml(File csv) throws IOException, ParseException {
		final Kml kml = new Kml();
		Document doc = kml.createAndSetDocument();
		Date TimeDate = null;
		FileReader fr = new FileReader(csv);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		str = br.readLine();
		double lat, lon;
		while (str != null) {
			String[] srr = str.split(",");
			if (srr[1].contains("/")) {
				TimeDate = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(srr[1]);
				
			} else {
				TimeDate = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(srr[1]);
			}
			lat = Double.parseDouble((srr[2].trim()));
			lon = Double.parseDouble((srr[3].trim()));

			doc.createAndAddPlacemark().withName(srr[6]).
			withOpen(Boolean.TRUE).createAndSetPoint()
			.addToCoordinates(lon, lat);

			str = br.readLine();

		}
		// marshals into file
		String KmlFile = "C:\\Users\\Omri Baruch\\Desktop\\CSVFile\\KMLFile\\kml";
		kml.marshal(new File(KmlFile));
	
		System.out.println("dssds");
	}
}
