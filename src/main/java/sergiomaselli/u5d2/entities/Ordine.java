package sergiomaselli.u5d2.entities;

import sergiomaselli.u5d2.enums.StatoOrdine;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numero;
    private StatoOrdine statoOrdine;
    private double coperto;
    private Tavolo tavolo;
    private List<MenuItem> items = new ArrayList<>();

    public Ordine(int numero, StatoOrdine statoOrdine, double coperto, Tavolo tavolo) {
        this.numero = numero;
        this.statoOrdine = statoOrdine;
        this.coperto = coperto;
        this.tavolo = tavolo;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void printOrder() {
        System.out.println("=== ORDINE #" + numero + " ===");
        System.out.println("Tavolo: " + tavolo);
        System.out.println("Stato: " + statoOrdine);
        double totale = coperto * tavolo.getCopertiMax();
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - €" + item.getPrice());
            totale += item.getPrice();
        }
        System.out.println("Coperto (€" + coperto + " x " + tavolo.getCopertiMax() + ")");
        System.out.println("Totale: €" + String.format("%.2f", totale));
        System.out.println("=========================");
    }
}
