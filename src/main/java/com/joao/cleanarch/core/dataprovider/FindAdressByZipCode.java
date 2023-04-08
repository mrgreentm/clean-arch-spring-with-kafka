package com.joao.cleanarch.core.dataprovider;

import com.joao.cleanarch.core.domain.Address;

public interface FindAdressByZipCode {

    Address find(final String zipCode);
}
