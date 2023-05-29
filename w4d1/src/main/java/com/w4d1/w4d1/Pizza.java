package com.w4d1.w4d1;


import com.w4d1.w4d1.Topping.toppings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pizza extends Food { 
    String name;
    boolean isLarge = false;
    toppings[] base = {toppings.Tomato, toppings.Cheese};

    
    public void showPizza() {
        System.out.print(this.name + " (");
        for (toppings t : base) {
            System.out.print(t + ", ");
        }
        System.out.print(this.getName() + ") Cal: "+this.getCal()+" Price "+this.getPrice());
        System.out.println();
    }
}
