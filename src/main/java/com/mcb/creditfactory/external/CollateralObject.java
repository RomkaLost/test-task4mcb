package com.mcb.creditfactory.external;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface CollateralObject {
    Short getYear();
    LocalDate getDate();
    CollateralType getType();
    BigDecimal getValue();
}
