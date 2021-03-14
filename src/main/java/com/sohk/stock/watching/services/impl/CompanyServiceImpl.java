package com.sohk.stock.watching.services.impl;

import com.sohk.stock.watching.dtos.CompanyData;
import com.sohk.stock.watching.entities.Company;
import com.sohk.stock.watching.repositories.CompanyRepository;
import com.sohk.stock.watching.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public CompanyData GetCompany(Long id) {
        return null;
    }
}
