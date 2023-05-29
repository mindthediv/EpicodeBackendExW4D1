package com.w4d1.w4d1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Topping extends Food {
    public enum toppings {Cheese,Ham,Onions,Pineapple,Salami,Tomato};
    toppings topping;
    @Override
    public String toString() {
        return this.getTopping() +" Cal "+this.getCal()+ " Price "+this.getPrice();
    }
}
