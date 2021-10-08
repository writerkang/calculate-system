package com.writerkang.calulatesystem.domain.aggregate.apt;

import java.util.Objects;

public class Apt {
    private AptId aptId;
    private String name;

    public Apt(AptId aptId, String name) {
        this.aptId = aptId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Apt apt = (Apt) o;
        return aptId.equals(apt.aptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aptId);
    }
}
