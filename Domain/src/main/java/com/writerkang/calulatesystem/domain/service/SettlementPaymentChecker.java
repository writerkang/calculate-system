package com.writerkang.calulatesystem.domain.service;

import com.writerkang.calulatesystem.domain.aggregate.bill.Bill;
import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPayment;
import java.math.BigDecimal;
import java.util.List;

public class SettlementPaymentChecker {

    public boolean isSameAmount(SettlementPayment settlementPayment, List<Bill> billList) {
        var sum = billList.stream()
            .map(Bill::billingAmount)
            .mapToDouble(BigDecimal::doubleValue)
            .sum();

        return settlementPayment.value().doubleValue() == sum;
    }
}
