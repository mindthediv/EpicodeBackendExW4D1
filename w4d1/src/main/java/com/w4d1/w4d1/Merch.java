package com.w4d1.w4d1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Merch extends Product {
    String name;

    public void showMerch() {
        System.out.println(this.getName() + " Price " + this.getPrice());
    }
}
