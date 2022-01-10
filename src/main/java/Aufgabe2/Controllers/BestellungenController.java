package Aufgabe2.Controllers;

import Aufgabe2.Entities.Bestellungen;
import Aufgabe2.Entities.Produkte;
import Aufgabe2.Repositories.ICrudRepository;

import java.util.List;

public class BestellungenController {
    private final ICrudRepository<Bestellungen> repo;

    public BestellungenController(ICrudRepository<Bestellungen> repo) {
        this.repo = repo;
    }

    public void addBestellungen(Bestellungen bestellungen){
        this.repo.create(bestellungen);
    }

    public void updateBestellungen(Bestellungen bestellungen){
        repo.update(bestellungen);
    }

    public void removeBestellungen(Bestellungen bestellungen){
        repo.delete(bestellungen);
    }

    public List<Bestellungen> getAll(){
        return repo.getAll();
    }

    public List<Bestellungen> sortList(){
        List<Bestellungen> bestellungenList = this.repo.getAll();
        bestellungenList.sort((b1, b2) -> {
            if (b1.Preis() < b2.Preis()) return 1;
            else if (b1.Preis() == b2.Preis()) return 0;
            return -1;
        });
        return bestellungenList;
    }
    
}
