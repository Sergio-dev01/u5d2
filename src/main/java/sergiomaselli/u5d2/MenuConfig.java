package sergiomaselli.u5d2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sergiomaselli.u5d2.entities.Drink;
import sergiomaselli.u5d2.entities.Pizza;
import sergiomaselli.u5d2.entities.Tavolo;
import sergiomaselli.u5d2.entities.Topping;
import sergiomaselli.u5d2.enums.StatoTavolo;

@Configuration
public class MenuConfig {

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", "Pomodoro, mozzarella", 1104, 4.99);
    }

    @Bean
    public Pizza diavola() {
        return new Pizza("Diavola", "Pomodoro, mozzarella, salame piccante", 1350, 6.49);
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping salami() {
        return new Topping("salami", 100, 1.00);
    }

    @Bean
    public Drink coca() {
        return new Drink("Coca-Cola", 158, 1.50);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(5, 2, StatoTavolo.LIBERO);
    }

    @Bean
    public Tavolo tavolo2() {
        return new Tavolo(2, 4, StatoTavolo.OCCUPATO);
    }
}
