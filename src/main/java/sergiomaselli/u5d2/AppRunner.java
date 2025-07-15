package sergiomaselli.u5d2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sergiomaselli.u5d2.entities.*;
import sergiomaselli.u5d2.enums.StatoOrdine;
import sergiomaselli.u5d2.enums.StatoTavolo;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    @Qualifier("margherita")
    private MenuItem margherita;

    @Autowired
    @Qualifier("diavola")
    private MenuItem diavola;

    @Autowired
    @Qualifier("cheese")
    private MenuItem cheese;

    @Autowired
    @Qualifier("salami")
    private MenuItem salami;

    @Autowired
    @Qualifier("coca")
    private MenuItem coca;

    @Autowired
    @Qualifier("lemonade")
    private MenuItem lemonade;

    @Autowired
    @Qualifier("tavolo1")
    private Tavolo tavolo1;

    @Autowired
    @Qualifier("tavolo2")
    private Tavolo tavolo2;


    @Value("${coperto.prezzo}")
    private double prezzoCoperto;

    public AppRunner(
            Pizza margherita,
            Pizza diavola,
            Topping cheese,
            Topping salami,
            Drink coca,
            Drink lemonade,
            Tavolo tavolo1,
            Tavolo tavolo2,
            @Value("${coperto.prezzo}") double prezzoCoperto
    ) {
        this.margherita = margherita;
        this.diavola = diavola;
        this.cheese = cheese;
        this.salami = salami;
        this.coca = coca;
        this.lemonade = lemonade;
        this.tavolo1 = tavolo1;
        this.tavolo2 = tavolo2;
        this.prezzoCoperto = prezzoCoperto;
    }

    @Override
    public void run(String... args) {
        tavolo1.setStatus(StatoTavolo.OCCUPATO);
        tavolo2.setStatus(StatoTavolo.OCCUPATO);

        // Ordine 1
        Ordine ordine1 = new Ordine(1, StatoOrdine.IN_CORSO, prezzoCoperto, tavolo1);
        ordine1.addItem(margherita);
        ordine1.addItem(salami);
        ordine1.addItem(coca);

        // Ordine 2
        Ordine ordine2 = new Ordine(2, StatoOrdine.IN_CORSO, prezzoCoperto, tavolo2);
        ordine2.addItem(diavola);
        ordine2.addItem(cheese);
        ordine2.addItem(lemonade);

        // Stampa ordini
        System.out.println("=== Stampa Ordine 1 ===");
        ordine1.printOrder();

        System.out.println("=== Stampa Ordine 2 ===");
        ordine2.printOrder();
    }
}
