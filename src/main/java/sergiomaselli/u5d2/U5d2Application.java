package sergiomaselli.u5d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d2Application {

    public static void main(String[] args) {
        SpringApplication.run(U5d2Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);

//        Pizza pizza = context.getBean("margherita", Pizza.class);
//        pizza.print();
//
//        Pizza pizza2 = context.getBean("diavola", Pizza.class);
//        pizza2.print();
//
//        Topping topping = context.getBean("cheese", Topping.class);
//        topping.print();
//
//        Topping topping2 = context.getBean("salami", Topping.class);
//        topping2.print();
//
//        Drink drink = context.getBean("coca", Drink.class);
//        drink.print();
//
//        Drink drink2 = context.getBean("lemonade", Drink.class);
//        drink2.print();


        context.close();

    }


}

