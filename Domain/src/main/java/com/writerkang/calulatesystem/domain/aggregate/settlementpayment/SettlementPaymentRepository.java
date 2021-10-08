package com.writerkang.calulatesystem.domain.aggregate.settlementpayment;

public interface SettlementPaymentRepository {

    SettlementPayment findById(SettlementPaymentId id);
}
