package com.beveragemachine.manager;

import com.beveragemachine.entities.*;
import com.beveragemachine.exception.IngredientsUnAvailableException;
import com.google.common.collect.Lists;

public class CoffeeManager implements BeverageManager {

    @Override
    public Beverage prepare() throws IngredientsUnAvailableException {
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient milk = ingredientStore.takeIngredient(IngredientType.MILK, 10);
        final Ingredient water = ingredientStore.takeIngredient(IngredientType.WATER, 50);
        final Ingredient coffee = ingredientStore.takeIngredient(IngredientType.COFFEE_SYRUP, 10);
        final Ingredient sugar = ingredientStore.takeIngredient(IngredientType.SUGAR_SYRUP, 10);
        return new Coffee(Lists.newArrayList(milk, water, coffee, sugar));
    }
}
