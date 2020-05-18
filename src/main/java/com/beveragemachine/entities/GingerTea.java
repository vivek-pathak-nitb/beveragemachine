package com.beveragemachine.entities;

import java.util.List;

public class GingerTea extends Tea {

    public GingerTea(final List<Ingredient> ingredients) {
        super(BeverageType.GINGER_TEA, ingredients);
    }
}
