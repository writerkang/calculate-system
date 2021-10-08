package com.writerkang.calulatesystem.domain.aggregate.resident;

import java.util.Objects;

public class ResidentId {
    private final String value;

    public ResidentId(String value) {
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
        ResidentId aptCode = (ResidentId) o;
        return value.equals(aptCode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
