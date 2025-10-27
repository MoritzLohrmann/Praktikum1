package business;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class SportvereinModel {
	private Sportverein sportverein;
	

	
	
	public void leseAusDatei(String typ) throws IOException{
    	
      			BufferedReader ein = new BufferedReader(new FileReader("Sportverein.csv"));
      			String[] zeile = ein.readLine().split(";");
      			this.sportverein = new Sportverein(zeile[0], 
      				zeile[1], 
      				Integer.parseInt(zeile[2]), 
      				Integer.parseInt(zeile[3]), 
      				zeile[4].split("_"));
      				ein.close();
      	  			
       		
	}
	public void schreibeSportvereineInCsvDatei() throws IOException {
		
			BufferedWriter aus = new BufferedWriter(new FileWriter("SportvereineAusgabe.csv", true));
			aus.write(sportverein.gibSportvereinZurueck(';'));
			aus.close();
			
			
	}
	
}

	
	
	

