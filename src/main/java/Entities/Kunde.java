package Entities;

public class Kunde {
    private int id;
    private String unternehmensname;
    private Unternehmensgroße unternehmensgroße;
    private int anzahlMitarbeiter;
    private int einkommenVonKunde;
    private String Ort;

    public Kunde(int id, String unternehmensname, Unternehmensgroße unternehmensgroße, int anzahlMitarbeiter, int einkommenVonKunde, String ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.unternehmensgroße = unternehmensgroße;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.einkommenVonKunde = einkommenVonKunde;
        this.Ort = ort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public Unternehmensgroße getUnternehmensgroße() {
        return unternehmensgroße;
    }

    public void setUnternehmensgroße(Unternehmensgroße unternehmensgroße) {
        this.unternehmensgroße = unternehmensgroße;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    public int getEinkommenVonKunde() {
        return einkommenVonKunde;
    }

    public void setEinkommenVonKunde(int einkommenVonKunde) {
        this.einkommenVonKunde = einkommenVonKunde;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        this.Ort = ort;
    }
}
