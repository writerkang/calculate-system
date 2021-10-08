package com.writerkang.calculatesystem.domain.aggregate.financialcompany;

import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompanyId;
import com.writerkang.calulatesystem.domain.common.fee.FlatFee;
import com.writerkang.calulatesystem.domain.common.fee.PercentageFee;
import com.writerkang.calulatesystem.domain.common.fee.FeeTime;
import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompany;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancialCompanyUnitTest {

    @Test
    void equal_success() {
        var one = new FinancialCompany(new FinancialCompanyId("1"), "신한카드",
            new PercentageFee(2.5), FeeTime.AFTER);

        var another = new FinancialCompany(new FinancialCompanyId("1"), "신한은행",
            new FlatFee(BigDecimal.valueOf(300)), FeeTime.BEFORE);

        Assertions.assertEquals(one, another);
    }

    @Test
    void equal_fail() {
        var one = new FinancialCompany(new FinancialCompanyId("1"), "신한카드",
            new PercentageFee(2.5), FeeTime.AFTER);

        var another = new FinancialCompany(new FinancialCompanyId("2"), "신한카드",
            new PercentageFee(2.5), FeeTime.AFTER);

        Assertions.assertNotEquals(one, another);
    }

    @Test
    void adjustedAmount_flatFee_success() {
        var company = new FinancialCompany(new FinancialCompanyId("1"), "신한은행",
            new FlatFee(BigDecimal.valueOf(300)), FeeTime.BEFORE);

        Assertions.assertEquals(BigDecimal.valueOf(700).doubleValue(),
            company.adjustedAmount(BigDecimal.valueOf(1000)).doubleValue());
    }

    @Test
    void adjustedAmount_percentageFee_success() {
        var company = new FinancialCompany(new FinancialCompanyId("1"), "신한은행",
            new PercentageFee(2.6), FeeTime.BEFORE);

        Assertions.assertEquals(BigDecimal.valueOf(974).doubleValue(),
            company.adjustedAmount(BigDecimal.valueOf(1000)).doubleValue());
    }

}
