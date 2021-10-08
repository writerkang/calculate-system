package com.writerkang.calculatesystem.domain.service;

import com.writerkang.calulatesystem.domain.aggregate.bill.Bill;
import com.writerkang.calulatesystem.domain.aggregate.bill.BillId;
import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompanyId;
import com.writerkang.calulatesystem.domain.aggregate.resident.ResidentId;
import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPayment;
import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPaymentId;
import com.writerkang.calulatesystem.domain.service.SettlementPaymentChecker;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SettlementPaymentCheckerUnitTest {

    private SettlementPaymentChecker settlementPaymentChecker;


    @BeforeEach
    void setUp() {
        this.settlementPaymentChecker = new SettlementPaymentChecker();
    }

    @Test
    void isCorrect_success() {
        var settlement = new SettlementPayment(new SettlementPaymentId("11"), new FinancialCompanyId("1"), BigDecimal.valueOf(200_212.2));
        var bill1 = new Bill(new BillId("1"), new ResidentId("1"), new FinancialCompanyId("1"),
            BigDecimal.valueOf(200_000), LocalDate.of(2021, 10, 8));
        var bill2 = new Bill(new BillId("2"), new ResidentId("1"), new FinancialCompanyId("1"),
            BigDecimal.valueOf(212.2), LocalDate.of(2021, 10, 8));

        Assertions.assertTrue(this.settlementPaymentChecker.isSameAmount(settlement, List.of(bill1, bill2)));
    }
}
