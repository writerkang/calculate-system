package com.writerkang.calulatesystem.domain.common.fee;

import java.math.BigDecimal;
import java.util.Objects;

public class FlatFee implements FeeType {
    private final BigDecimal value;

    public FlatFee(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        Objects.requireNonNull(amount);

        return this.value;
    }
}
