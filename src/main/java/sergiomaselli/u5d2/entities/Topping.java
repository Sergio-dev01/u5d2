package sergiomaselli.u5d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Topping extends MenuItem {

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public void print() {
        System.out.println(name + " " + calories + " cal " + price + " €");
    }
}
