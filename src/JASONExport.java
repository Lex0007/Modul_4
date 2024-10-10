import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class JASONExport {

    public void jsonexport(){
        ArrayList<Artikel> artlist = App.artikellisteAusDBDummy();

        StringBuilder stringBuilder = new StringBuilder();
        List<String> json = new ArrayList<>();

        for (Artikel a : artlist) {
            String ablaufdatum = a.getAblaufdatum().get(GregorianCalendar.YEAR) + "."
                    + (a.getAblaufdatum().get(GregorianCalendar.MONTH)+1) + "."
                    + a.getAblaufdatum().get(GregorianCalendar.DAY_OF_MONTH);

            String jsonObject = String.format(
                    Locale.US,
                    "  \"Nummer\": \"%s\",\n" +
                            "  \"Bezeichnung\": \"%s\",\n" +
                            "  \"Einkaufspreis\": %.2f,\n" +
                            "  \"Ablaufdatum\": \"%s\",\n" +
                            "  \"Kategorienummer\": \"%s\"\n" +
                            "}",
                    a.getNummer(),
                    a.getBezeichnung(),
                    a.getEinkaufspreis(),
                    ablaufdatum,
                    a.getKategorienummer()
            );
            stringBuilder.append(jsonObject);
        }
        stringBuilder.append("[\n");
        stringBuilder.append(String.join(",\n", json));
        stringBuilder.append("]\n");

        String stringBuilderString = stringBuilder.toString();
        System.out.println(stringBuilderString);
    }
}
