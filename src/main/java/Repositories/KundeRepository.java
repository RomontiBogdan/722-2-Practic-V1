package Repositories;

import Entities.Kunde;
import Entities.Unternehmensgroße;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class KundeRepository {
    public List<Kunde> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Kunde kunde;
        List<Kunde> kundeList = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            kunde = new Kunde(Integer.parseInt(attributes[0]), attributes[1], Unternehmensgroße.valueOf(attributes[2]), Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]), attributes[5]);
            kundeList.add(kunde);

            line = bufferedReader.readLine();
        }

        return kundeList;
    }

    public void writeToFile(String fileName, List<Kunde> kundeList, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Kunde kunde : kundeList) {
            String line = kunde.getId() + character + kunde.getUnternehmensname() + character +
                    kunde.getUnternehmensgroße() + character + kunde.getAnzahlMitarbeiter() + character +
                    kunde.getEinkommenVonKunde() + character + kunde.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public List<Kunde> sortAnzahlMitarbeiter(List<Kunde> kundeList){
        kundeList.sort((k1, k2) -> {
            if (k1.getAnzahlMitarbeiter() < k2.getAnzahlMitarbeiter()) return 1;
            else if (k1.getAnzahlMitarbeiter() == k2.getAnzahlMitarbeiter()) return 0;
            return -1;
        });
        return kundeList;
    }
}
