package com.writerkang.calulatesystem.domain.aggregate.settlementpayment;

import java.util.Objects;

public class SettlementPaymentId {
    private final String value;

    public SettlementPaymentId(String code) {
        Objects.requireNonNull(code);

        this.value = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SettlementPaymentId aptCode = (SettlementPaymentId) o;
        return value.equals(aptCode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
