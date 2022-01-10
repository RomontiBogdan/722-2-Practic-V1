package Aufgabe2.Repositories;

import Aufgabe2.Entities.Bestellungen;
import Aufgabe2.Entities.Produkte;

public class BestellungenRepository extends InMemoryRepository<Bestellungen>{
    public BestellungenRepository() {
        super();
    }

    public Bestellungen update(Bestellungen bestellungen) {
        Bestellungen updatedBestellungen = this.repoList.stream().filter(best -> best.getBestellnr() == best.getBestellnr()).findFirst().orElseThrow();
        updatedBestellungen.setBestellnr(bestellungen.getBestellnr());
        updatedBestellungen.setAdresse(bestellungen.getAdresse());
        updatedBestellungen.setProdukteList(bestellungen.getProdukteList());

        return updatedBestellungen;
    }
}
