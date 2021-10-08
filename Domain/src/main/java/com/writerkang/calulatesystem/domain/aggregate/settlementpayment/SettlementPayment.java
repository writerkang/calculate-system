package com.writerkang.calulatesystem.domain.aggregate.settlementpayment;

import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompanyId;
import java.math.BigDecimal;

public class SettlementPayment {
    private SettlementPaymentId id;
    private FinancialCompanyId financialCompanyId;
    private BigDecimal value;

    public SettlementPayment(SettlementPaymentId id,
        FinancialCompanyId financialCompanyId, BigDecimal value) {
        this.id = id;
        this.financialCompanyId = financialCompanyId;
        this.value = value;
    }

    public BigDecimal value() {
        return this.value;
    }
}
