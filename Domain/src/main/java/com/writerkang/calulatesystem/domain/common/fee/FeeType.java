package com.writerkang.calulatesystem.domain.common.fee;

import java.math.BigDecimal;

public interface FeeType {
    BigDecimal calculate(BigDecimal amount);
}
