package com.writerkang.calulatesystem.domain.aggregate.apt;

import java.util.Objects;

public class AptId {
    private final String value;

    public AptId(String value) {
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
        AptId aptId = (AptId) o;
        return value.equals(aptId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
