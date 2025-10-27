package gui;
import java.io.IOException;

import business.*;

public class SportvereinControl {
	
	private Sportverein sportverein;
	private SportvereinModel sportvereinmodel;
	private SportvereinView sportvereinview;
	
	public void schreibeSportvereineInCsvDatei(String typ) {
		try {
			if("csv".equals(typ)){
			sportvereinmodel.schreibeSportvereineInCsvDatei();
			sportvereinview.zeigeInformationsfensterAn("Die Sportvereine wurden gespeichert!");
			}
			else {
				sportvereinview.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
  		}
			
	
		catch(IOException exc){
			sportvereinview.zeigeFehlermeldungsfensterAn("IOException beim Speichern!");
		}
		catch(Exception exc){
			sportvereinview.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
		
		}

	}

	public void leseAusDatei(String typ) {
		try {
			if("csv".equals(typ)){
				sportvereinmodel.schreibeSportvereineInCsvDatei();
			}
		}
		catch(IOException exc){
			sportvereinview.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
	}
		catch(Exception exc){
			sportvereinview.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
		}
	}
	public void nehmeSportvereinAuf(){
    	try{ 
    		this.sportverein = new Sportverein(
    			sportvereinview.txtName.getText(), 
    			sportvereinview.txtOrt.getText(),
   	            Integer.parseInt(sportvereinview.txtAnzahlMitglieder.getText()),
   	        	Integer.parseInt(sportvereinview.txtAnzahlEhemaligerMitglieder.getText()),
   	        	sportvereinview.txtSportarten.getText().split(";"));
    		sportvereinview.zeigeInformationsfensterAn("Der Sportverein wurde aufgenommen!");
       	}
       	catch(Exception exc){
       		sportvereinview.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
	}
	public void zeigeSportvereineAn(){
    	if(this.sportverein != null){
    		sportvereinview.txtAnzeige.setText(
    			this.sportverein.gibSportvereinZurueck(' '));
    	}
    	else{
    		sportvereinview.zeigeInformationsfensterAn("Bisher wurde keine Sportverein aufgenommen!");
    	}
    }
}

