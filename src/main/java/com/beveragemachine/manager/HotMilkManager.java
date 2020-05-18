package com.beveragemachine.manager;

import com.beveragemachine.entities.*;
import com.beveragemachine.exception.IngredientsUnAvailableException;
import com.google.common.collect.Lists;

public class HotMilkManager implements BeverageManager {

    @Override
    public Beverage prepare() throws IngredientsUnAvailableException {
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient ingredient = ingredientStore.takeIngredient(IngredientType.MILK, 50);
        return new HotMilk(Lists.newArrayList(ingredient));
    }
}
