package Aufgabe2.Repositories;

import Aufgabe2.Entities.Produkte;

public class ProdukteRepository extends InMemoryRepository<Produkte>{
    public ProdukteRepository() {
        super();
    }

    public Produkte update(Produkte produkte) {
        Produkte updatedProdukt = this.repoList.stream().filter(prod -> prod.getName() == prod.getName()).findFirst().orElseThrow();
        updatedProdukt.setName(produkte.getName());
        updatedProdukt.setPreis(produkte.getPreis());

        return updatedProdukt;
    }
}
