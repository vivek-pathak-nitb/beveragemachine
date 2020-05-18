package com.beveragemachine.manager;

import com.beveragemachine.entities.*;
import com.beveragemachine.exception.IngredientsUnAvailableException;

import java.util.ArrayList;
import java.util.List;

public class GingerTeaManager extends TeaManager {

    @Override
    public Beverage prepare() throws IngredientsUnAvailableException {
        final Beverage beverage = super.prepare();
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient ginger = ingredientStore.takeIngredient(IngredientType.GINGER_SYRUP, 5);
        final List<Ingredient> ingredientList = new ArrayList<>(beverage.getIngredientList());
        ingredientList.add(ginger);
        return new GingerTea(ingredientList);
    }
}
