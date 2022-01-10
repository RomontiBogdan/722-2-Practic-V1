import Entities.Kunde;
import Repositories.KundeRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KundeRepository repo = new KundeRepository();
        List<Kunde> kundeList = new ArrayList<>();

        try {
            kundeList = repo.readFromFile(System.getProperty("user.dir") + "\\src\\main\\java\\Data\\kundendaten.txt", ",");

            kundeList = repo.sortAnzahlMitarbeiter(kundeList);

            repo.writeToFile(System.getProperty("user.dir") + "\\src\\main\\java\\Data\\kundensortiert.txt", kundeList, ",");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//for(Kunde kunde: kundeList){
//        System.out.println(kunde.getId() + " " + kunde.getUnternehmensname() + " " + kunde.getUnternehmensgroße() + " " + kunde.getAnzahlMitarbeiter() + " " + kunde.getEinkommenVonKunde() + " " + kunde.getOrt());
//        }