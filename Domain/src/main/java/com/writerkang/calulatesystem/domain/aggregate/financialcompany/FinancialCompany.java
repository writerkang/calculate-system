package com.writerkang.calulatesystem.domain.aggregate.financialcompany;

import com.writerkang.calulatesystem.domain.common.fee.FeeTime;
import com.writerkang.calulatesystem.domain.common.fee.FeeType;
import java.math.BigDecimal;
import java.util.Objects;

public class FinancialCompany {
    private FinancialCompanyId id;
    private String name;
    private FeeType feeType;
    private FeeTime feeTime;

    public FinancialCompany(FinancialCompanyId id,
        String name, FeeType feeType, FeeTime feeTime) {

        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(feeType);
        Objects.requireNonNull(feeTime);

        this.id = id;
        this.name = name;
        this.feeType = feeType;
        this.feeTime = feeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinancialCompany that = (FinancialCompany) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public BigDecimal adjustedAmount(BigDecimal value) {
        Objects.requireNonNull(value);

        return value.subtract(feeType.calculate(value));
    }
}
