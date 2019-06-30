package com.test.example.dao;

import com.simple.base.dao.BaseRepository;
import com.test.example.entity.Company;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface CompanyRepository extends BaseRepository<Company,Long> {

    List<Company> testExtention();
}
