package com.writerkang.calulatesystem.domain.aggregate.managementoffice;

import com.writerkang.calulatesystem.domain.aggregate.apt.AptId;
import com.writerkang.calulatesystem.domain.common.fee.FeeTime;
import com.writerkang.calulatesystem.domain.common.fee.FeeType;
import java.math.BigDecimal;
import java.util.Objects;

public class ManagementOffice {
    private long id;
    private String name;
    private AptId aptId;
    private FeeType feeType;
    private FeeTime feeTime;

    public ManagementOffice(long id,
        String name, AptId aptId,
        FeeType feeType, FeeTime feeTime) {

        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(aptId);
        Objects.requireNonNull(feeType);
        Objects.requireNonNull(feeTime);

        this.id = id;
        this.name = name;
        this.aptId = aptId;
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
        ManagementOffice that = (ManagementOffice) o;
        return id == that.id;
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
