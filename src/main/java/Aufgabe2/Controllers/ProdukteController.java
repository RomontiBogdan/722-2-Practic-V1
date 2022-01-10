package Aufgabe2.Controllers;

import Aufgabe2.Entities.Produkte;
import Aufgabe2.Repositories.ICrudRepository;

import java.util.List;

public class ProdukteController {
    private final ICrudRepository<Produkte> repo;

    public ProdukteController(ICrudRepository<Produkte> repo) {
        this.repo = repo;
    }

    public void addProdukte(Produkte produkte){
        this.repo.create(produkte);
    }

    public void updateProdukte(Produkte produkte){
        repo.update(produkte);
    }

    public void removeProdukte(Produkte produkte){
        repo.delete(produkte);
    }

    public List<Produkte> getAll(){
        return repo.getAll();
    }
}
