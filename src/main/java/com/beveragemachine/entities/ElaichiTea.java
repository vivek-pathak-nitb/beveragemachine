package com.beveragemachine.entities;

import java.util.List;

public class ElaichiTea extends Tea {

    public ElaichiTea(final List<Ingredient> ingredientList) {
        super(BeverageType.ELAICHI_TEA, ingredientList);
    }
}
