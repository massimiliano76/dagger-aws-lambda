package com.salves.di.daggeraws.domain.implementation;

import com.salves.di.daggeraws.domain.IAService;
import com.salves.di.daggeraws.domain.IAggregateService;
import com.salves.di.daggeraws.domain.IBService;

import javax.inject.Inject;

public class AggregateService implements IAggregateService {

    private IAService iaService;
    private IBService ibService;

    @Inject
    public AggregateService(IAService iaService, IBService ibService) {
        this.iaService = iaService;
        this.ibService = ibService;
    }

    @Override
    public String printABC() {
        return iaService.printA() + ibService.printB() + "C";
    }
}
