package com.writerkang.calculatesystem.domain.aggregate.managementoffice;

import com.writerkang.calulatesystem.domain.aggregate.apt.AptId;
import com.writerkang.calulatesystem.domain.aggregate.managementoffice.ManagementOffice;
import com.writerkang.calulatesystem.domain.common.fee.FeeTime;
import com.writerkang.calulatesystem.domain.common.fee.FlatFee;
import com.writerkang.calulatesystem.domain.common.fee.PercentageFee;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagementOfficeUnitTest {

    @Test
    void adjustedAmount_flatFee_success() {
        var office = new ManagementOffice(1l, "현대아파트관리사무소",
            new AptId("22222"), new FlatFee(BigDecimal.valueOf(300)), FeeTime.BEFORE);

        Assertions.assertEquals(BigDecimal.valueOf(700).doubleValue(),
            office.adjustedAmount(BigDecimal.valueOf(1000)).doubleValue());
    }

    @Test
    void adjustedAmount_percentageFee_success() {
        var office = new ManagementOffice(1l, "현대아파트관리사무소",
            new AptId("22222"), new PercentageFee(2.6), FeeTime.BEFORE);

        Assertions.assertEquals(BigDecimal.valueOf(1000 * (1 - 0.026)).doubleValue(),
            office.adjustedAmount(BigDecimal.valueOf(1000)).doubleValue());
    }

}
