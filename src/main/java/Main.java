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

            //kundeList = repo.sortAnzahlMitarbeiter(kundeList);

            //repo.writeToFile(System.getProperty("user.dir") + "\\src\\main\\java\\Data\\kundensortiert.txt", kundeList, ",");

            repo.writeStatistik(System.getProperty("user.dir") + "\\src\\main\\java\\Data\\statistik.txt", kundeList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

