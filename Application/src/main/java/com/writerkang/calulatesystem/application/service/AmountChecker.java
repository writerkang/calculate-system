package com.writerkang.calulatesystem.application.service;

import com.writerkang.calulatesystem.domain.aggregate.bill.BillId;
import com.writerkang.calulatesystem.domain.aggregate.bill.BillRepository;
import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPaymentId;
import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPaymentRepository;
import com.writerkang.calulatesystem.domain.service.SettlementPaymentChecker;
import java.util.List;
import java.util.stream.Collectors;

public class AmountChecker {

    private final SettlementPaymentChecker checker;
    private final SettlementPaymentRepository settlementPaymentRepository;
    private final BillRepository billRepository;

    public AmountChecker(
        SettlementPaymentChecker checker,
        SettlementPaymentRepository settlementPaymentRepository,
        BillRepository billRepository) {
        this.checker = checker;
        this.settlementPaymentRepository = settlementPaymentRepository;
        this.billRepository = billRepository;
    }

    public boolean check(SettlementPaymentId settlementPaymentId, List<BillId> billIdList) {
        var settlementPayment =
            this.settlementPaymentRepository.findById(settlementPaymentId);

        var billList = billIdList.stream()
            .map(id -> this.billRepository.findById(id))
            .collect(Collectors.toList());

        return this.checker.isSameAmount(settlementPayment, billList);
    }
}
