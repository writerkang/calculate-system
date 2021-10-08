package com.writerkang.calulatesystem.domain.common.fee;

import java.math.BigDecimal;

public class PercentageFee implements FeeType {
    private final double percentage;

    public PercentageFee(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        return BigDecimal.valueOf(amount.doubleValue() * this.percentage / 100);
    }
}
