import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CSVExport {

    public void exportCSV(){
        ArrayList<Artikel> artlist = App.artikellisteAusDBDummy();
        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for (Artikel a : artlist){
            String ablaufdatum = a.getAblaufdatum().get(GregorianCalendar.YEAR) + "."
                    + (a.getAblaufdatum().get(GregorianCalendar.MONTH)+1) + "."
                    + a.getAblaufdatum().get(GregorianCalendar.DAY_OF_MONTH);


            System.out.println(a.getNummer() + ";"
            + a.getBezeichnung() + ";"
            + a.getEinkaufspreis()
            + ablaufdatum +";"
            + a.getKategorienummer());
        }

    }

}
