package com.w4d1.w4d1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Drink extends Food {
    String name;
    public void showDrink() {
        System.out.print(this.getName() + " Cal: "  +this.getCal()+" Price "+this.getPrice());
        System.out.println();
    }
}
