package Aufgabe2.Entities;

import java.util.List;

public class Bestellungen {
    int bestellnr;
    String adresse;
    List<Produkte> produkteList;

    public Bestellungen(int bestellnr, String adresse, List<Produkte> produkteList) {
        this.bestellnr = bestellnr;
        this.adresse = adresse;
        this.produkteList = produkteList;
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produkte> getProdukteList() {
        return produkteList;
    }

    public void setProdukteList(List<Produkte> produkteList) {
        this.produkteList = produkteList;
    }

    public int Preis(){
        int summe = 0;
        for(Produkte produkte : produkteList){
            summe += produkte.getPreis();
        }
        return summe;
    }
}
