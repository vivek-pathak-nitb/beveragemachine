package com.beveragemachine.entities;

public class Ingredient {

    private final IngredientType ingredientType;
    private final int quantity;

    public Ingredient(final IngredientType ingredientType,
                      final int quantity) {
        this.ingredientType = ingredientType;
        this.quantity = quantity;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public int getQuantity() {
        return quantity;
    }
}
