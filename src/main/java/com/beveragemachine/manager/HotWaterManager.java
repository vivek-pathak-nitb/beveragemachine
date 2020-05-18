package com.beveragemachine.manager;

import com.beveragemachine.entities.*;
import com.beveragemachine.exception.IngredientsUnAvailableException;
import com.google.common.collect.Lists;

public class HotWaterManager implements BeverageManager {

    @Override
    public Beverage prepare() throws IngredientsUnAvailableException {
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient ingredient = ingredientStore.takeIngredient(IngredientType.WATER, 500);
        return new HotWater(Lists.newArrayList(ingredient));
    }
}
