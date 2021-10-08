package com.writerkang.calculatesystem.domain.infrastructure;

import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompany;
import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompanyId;
import com.writerkang.calulatesystem.domain.aggregate.financialcompany.FinancialCompanyRepository;
import com.writerkang.calulatesystem.domain.common.fee.FeeTime;
import com.writerkang.calulatesystem.domain.common.fee.FlatFee;
import java.math.BigDecimal;

public class TestFinancialCompanyRepository implements FinancialCompanyRepository {

    @Override
    public FinancialCompany findById(FinancialCompanyId id) {
        return new FinancialCompany(
            new FinancialCompanyId("1"),
            "신한은행",
            new FlatFee(BigDecimal.valueOf(200)),
            FeeTime.AFTER
        );
    }
}
