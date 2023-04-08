package com.joao.cleanarch.core.usecase.impl;

import com.joao.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.joao.cleanarch.core.dataprovider.InsertCostumer;
import com.joao.cleanarch.core.domain.Costumer;
import com.joao.cleanarch.core.usecase.InsertCostumerUseCase;

public class InsertCostumerUseCaseImpl implements InsertCostumerUseCase {
    private final FindAdressByZipCode findAdressByZipCode;
    private final InsertCostumer insertCostumer;

    public InsertCostumerUseCaseImpl(FindAdressByZipCode findAdressByZipCode, InsertCostumer insertCostumer) {
        this.findAdressByZipCode = findAdressByZipCode;
        this.insertCostumer = insertCostumer;
    }

    @Override
    public void insert(Costumer costumer, String zipCode) {
        var address =findAdressByZipCode.find(zipCode);
        costumer.setAddress(address);
        insertCostumer.insert(costumer);
    }
}
