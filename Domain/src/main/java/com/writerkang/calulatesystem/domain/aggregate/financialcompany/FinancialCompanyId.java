package com.writerkang.calulatesystem.domain.aggregate.financialcompany;

import java.util.Objects;

public class FinancialCompanyId {
    private final String value;

    public FinancialCompanyId(String code) {
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
        FinancialCompanyId aptCode = (FinancialCompanyId) o;
        return value.equals(aptCode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
