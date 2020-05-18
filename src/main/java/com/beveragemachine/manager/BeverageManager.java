package com.beveragemachine.manager;

import com.beveragemachine.entities.Beverage;
import com.beveragemachine.exception.IngredientsUnAvailableException;

public interface BeverageManager {

    Beverage prepare() throws IngredientsUnAvailableException;
}
