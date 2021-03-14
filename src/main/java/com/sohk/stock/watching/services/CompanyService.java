package com.sohk.stock.watching.services;

import com.sohk.stock.watching.dtos.CompanyData;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService {
    CompanyData GetCompany(Long id);
}
