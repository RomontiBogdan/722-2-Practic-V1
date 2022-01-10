package Aufgabe2.Menu;

import Aufgabe2.Controllers.BestellungenController;
import Aufgabe2.Controllers.ProdukteController;
import Aufgabe2.Entities.Bestellungen;
import Aufgabe2.Entities.Produkte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private ProdukteController produkteController;
    private BestellungenController bestellungenController;

    public ConsoleView(ProdukteController produkteController, BestellungenController bestellungenController) {
        this.produkteController = produkteController;
        this.bestellungenController = bestellungenController;
    }

    private Produkte getProdukte(){
        Scanner scan= new Scanner(System.in);
        String name;
        int preis;
        System.out.println("Name:");
        name = scan.nextLine();
        System.out.println("Preis:");
        preis = Integer.parseInt(scan.nextLine());
        return new Produkte(name, preis);
    }

    private Bestellungen getBestellung(){
        Scanner scan= new Scanner(System.in);
        String adresse;
        int bestellnr;
        List<Produkte> produkteList = new ArrayList<>();
        System.out.println("Bestellung nr:");
        bestellnr = Integer.parseInt(scan.nextLine());
        System.out.println("Adresse:");
        adresse = scan.nextLine();
        return new Bestellungen(bestellnr, adresse, produkteList);
    }

    public void menu() {
        System.out.println("1.Add Produkt\n 2.Delete Produkt\n 3.Update Produkt\n 4.Show Produkte\n 5.Add Bestellung\n 6.Delete Bestellung\n 7.Update Bestellung\n 8.Show Bestellungen\n 9.Exit");
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            int key;
            Produkte produkte;
            Bestellungen bestellungen;
            do {
                System.out.print("Option: ");
                key = keyboard.nextInt();
            }
            while (key < 1 || key > 10);

            switch (key) {
                case 1 -> {
                    produkte = getProdukte();
                    produkteController.addProdukte(produkte);
                }
                case 2 -> {
                    produkte = getProdukte();
                    produkteController.removeProdukte(produkte);
                }
                case 3 -> {
                    produkte = getProdukte();
                    produkteController.updateProdukte(produkte);
                }
                case 4 -> {
                    for(Produkte produkte1 : produkteController.getAll()){
                            System.out.println(produkte1.getName() + " " + produkte1.getPreis());
                    }
                }
                case 5 -> {
                    bestellungen = getBestellung();
                    bestellungenController.addBestellungen(bestellungen);
                }
                case 6 -> {
                    bestellungen = getBestellung();
                    bestellungenController.removeBestellungen(bestellungen);
                }
                case 7 -> {
                    bestellungen = getBestellung();
                    bestellungenController.updateBestellungen(bestellungen);
                }
                case 8 -> {
                    for(Bestellungen bestellungen1 : bestellungenController.getAll()){
                        System.out.println(bestellungen1.getBestellnr() + " " + bestellungen1.getAdresse() + "Produkte: ");
                        for(Produkte produkte1 : bestellungen1.getProdukteList()){
                            System.out.println(produkte1.getName() + " " + produkte1.getPreis());
                        }
                    }
                }
                case 9 -> {
                    return;
                }
            }
        }
    }
}