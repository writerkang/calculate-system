package com.writerkang.calulatesystem.domain.aggregate.bill;

import java.util.Objects;

public class BillId {
    private final String value;

    public BillId(String value) {
        Objects.requireNonNull(value);

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillId aptCode = (BillId) o;
        return value.equals(aptCode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
