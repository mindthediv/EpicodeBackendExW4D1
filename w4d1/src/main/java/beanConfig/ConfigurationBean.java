package beanConfig;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.w4d1.w4d1.Drink;
import com.w4d1.w4d1.Food;
import com.w4d1.w4d1.Pizza;
import com.w4d1.w4d1.Product;
import com.w4d1.w4d1.Topping.toppings;

@Configuration
public class ConfigurationBean {
    toppings[] margherita = {toppings.Tomato, toppings.Cheese} ;
    toppings[] hawaian = {toppings.Tomato, toppings.Cheese, toppings.Ham, toppings.Pineapple} ;
    toppings[] salami = {toppings.Tomato, toppings.Cheese, toppings.Cheese} ;

    @Bean
    public Food margherita() {
        return new Pizza("Pizza Margherita",false,margherita);
    }

    @Bean
    public Food hawaianPizza() {
        return new Pizza("Hawaian Pizza",false,hawaian );
    }

    @Bean
    public Food salamiPizza() {
        return new Pizza("Salami Pizza",false,salami );
    }

    @Bean
    public Food lemonade() {
        Drink lemonade = new Drink("lemonade");
        lemonade.setCal(128);
        lemonade.setPrice(1.29);
        return lemonade;
    }
    @Bean
    public Food water() {
        Drink water = new Drink("water");
        water.setCal(0);
        water.setPrice(1.29);
        return water;
    }
    @Bean
    public Food wine() {
        Drink wine = new Drink("wine");
        wine.setCal(607);
        wine.setPrice(7.49);
        return wine;
    }

    @Bean
    public Product shirt(){
        Product Shirt = new Product(21.99);
        return Shirt;
    }
    @Bean
    public Product mug(){
        Product Mug = new Product(4.99);
        return Mug;
    }
}
