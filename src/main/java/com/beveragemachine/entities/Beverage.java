package com.beveragemachine.entities;

import java.util.List;

public abstract class Beverage {

    private final BeverageType beverageType;
    private final List<Ingredient> ingredientList;

    public Beverage(final BeverageType beverageType,
                    final List<Ingredient> ingredientList) {
        this.beverageType = beverageType;
        this.ingredientList = ingredientList;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }
}
