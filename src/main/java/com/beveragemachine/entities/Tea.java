package com.beveragemachine.entities;

import java.util.List;

public class Tea extends Beverage {

    public Tea(final BeverageType beverageType, final List<Ingredient> ingredientList) {
        super(beverageType, ingredientList);
    }
}
