package sergiomaselli.u5d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Pizza extends MenuItem {
    private String ingredients;

    public Pizza(String name, String ingredients, int calories, double price) {
        super(name, calories, price);
        this.ingredients = ingredients;
    }

    @Override
    public void print() {
        System.out.println(name + " (" + ingredients + ") " + calories + " cal " + price + " €");
    }
}
