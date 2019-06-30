package com.test.example.service;

import com.simple.base.service.BaseService;
import com.test.example.entity.Company;

import java.util.List;

public interface CompanyService extends BaseService<Company,Long> {
    List<Company> testExtention();
}
