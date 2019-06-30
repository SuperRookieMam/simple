package com.test.example.service.impl;

import com.simple.base.service.impl.BaseServiceImpl;
import com.test.example.dao.CompanyRepository;
import com.test.example.entity.Company;
import com.test.example.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company,Long> implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    @Override
    public List<Company> testExtention() {
        return companyRepository.testExtention();
    }
}
