package com.joao.cleanarch.core.usecase;

import com.joao.cleanarch.core.domain.Costumer;

public interface InsertCostumerUseCase {
    void insert(Costumer costumer, String zipCode);
}
