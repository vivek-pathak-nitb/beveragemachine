package com.beveragemachine.entities;

import com.beveragemachine.exception.IngredientsUnAvailableException;
import com.beveragemachine.exception.OutletUnavailableException;
import com.beveragemachine.factory.BeverageManagerFactory;
import com.beveragemachine.manager.BeverageManager;

import java.util.concurrent.atomic.AtomicInteger;

public class BeverageMachine {

    private AtomicInteger freeOutlets;
    private final BeverageManagerFactory beverageManagerFactory;

    public BeverageMachine(final int outlets,
                           final BeverageManagerFactory beverageManagerFactory) {
        this.freeOutlets = new AtomicInteger(outlets);
        this.beverageManagerFactory = beverageManagerFactory;
    }

    public Beverage prepareBeverage(final BeverageType beverageType) throws IngredientsUnAvailableException, OutletUnavailableException {
        if (freeOutlets.get() == 0) {
            throw new OutletUnavailableException("No outlets is free");
        }

        System.out.println(" Preparing " + beverageType.name());
        freeOutlets.decrementAndGet();
        final BeverageManager beverageManager = beverageManagerFactory.getBeverageManager(beverageType);
        final Beverage beverage = beverageManager.prepare();
        freeOutlets.incrementAndGet();
        return beverage;
    }
}
