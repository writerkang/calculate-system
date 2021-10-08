package com.writerkang.calulatesystem.domain.aggregate.bill;

import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPayment;
import com.writerkang.calulatesystem.domain.aggregate.settlementpayment.SettlementPaymentId;

public interface BillRepository {

    Bill findById(BillId id);
}
