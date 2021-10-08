package com.writerkang.calulatesystem.domain.aggregate.financialcompany;

public interface FinancialCompanyRepository {
    FinancialCompany findById(FinancialCompanyId id);
}
