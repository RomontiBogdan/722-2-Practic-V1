package Aufgabe2.Menu;

import Aufgabe2.Controllers.ProdukteController;
import Aufgabe2.Entities.Produkte;

import java.util.Scanner;

public class ConsoleView {
    private ProdukteController produkteController;

    public ConsoleView(ProdukteController produkteController) {
        this.produkteController = produkteController;
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


    public void menu() {
        System.out.println("1.Add Produkte\n 2.Delete Produkte\n 3.Update Produkte\n 4.Show Produkte\n 5.Exit");
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            int key;
            Produkte produkte;
            do {
                System.out.print("Option: ");
                key = keyboard.nextInt();
            }
            while (key < 1 || key > 5);

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

                }
                case 5 -> {
                    return;
                }
            }
        }
    }
}