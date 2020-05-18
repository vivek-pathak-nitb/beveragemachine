package com.beveragemachine.manager;

import com.beveragemachine.entities.*;
import com.beveragemachine.exception.IngredientsUnAvailableException;

import java.util.ArrayList;
import java.util.List;

public class ElaichiTeaManager extends TeaManager {

    @Override
    public Beverage prepare() throws IngredientsUnAvailableException {
        final Beverage beverage = super.prepare();
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient eliachi = ingredientStore.takeIngredient(IngredientType.ELAICHI_SYRUP, 5);
        final List<Ingredient> ingredientList = new ArrayList<>(beverage.getIngredientList());
        ingredientList.add(eliachi);
        return new ElaichiTea(ingredientList);
    }
}
