package com.writerkang.calulatesystem.domain.aggregate.bill;

import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompanyId;
import com.writerkang.calulatesystem.domain.aggregate.resident.ResidentId;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Bill {

    private BillId id;
    private ResidentId residentId;
    private FinancialCompanyId financialCompanyId;
    private BigDecimal billingAmount;
    private LocalDate dueDate;

    public Bill(BillId id, ResidentId residentId,
        FinancialCompanyId financialCompanyId,
        BigDecimal billingAmount, LocalDate dueDate) {
        this.id = id;
        this.residentId = residentId;
        this.financialCompanyId = financialCompanyId;
        this.billingAmount = billingAmount;
        this.dueDate = dueDate;
    }

    public FinancialCompanyId financialCompanyId() {
        return financialCompanyId;
    }

    public BigDecimal billingAmount() {
        return billingAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bill bill = (Bill) o;
        return id.equals(bill.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
